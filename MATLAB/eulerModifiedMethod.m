function [ ] = eulerModifiedMethod(f,xo,yo,xn,h)
% f= @(x,y) exp(x)+y;
% xo=0;
% yo=0;
% h=0.2;
% xn=0.6;
x= xo:h:xn;
n = length(x);
y =zeros(1,n);
y(1) = yo;
err = 10^-8;
yprev = 0;
for i = 2:n
    m = f(x(i-1),y(i-1));
    y(i) = y(i-1)+h*m;
    while (abs(y(i)-yprev)>err)
        m2 = (m+f(x(i),y(i)))/2;
        yprev = y(i);
        y(i) = y(i-1)+h*m2;
    end
end
disp(vpa(y,8))
z = eval(dsolve('Dy=y+exp(x)','y(0)=0','x'));
plot(x,y,'r',x,z,'b')

    