function [] = rungeKutta(f,yo,xo,h,xn)
% f=@(x,y) 3*x+y/2;
% xo=0;
% y0=1;
% h=0.05;
% xn=0.4;

x= xo:h:xn;
n = length(x);
y =zeros(1,n);
y(1) = yo;
for i=2:n
    k1= h*f(x(i-1),y(i-1));
    k2 = h*f(x(i-1)+(h/2),(y(i-1)+(k1/2)));
    k3 = h*f(x(i-1)+(h/2),(y(i-1)+(k2/2)));
    k4 = h*f(x(i-1)+h,y(i-1)+k3);
    y(i) = y(i-1)+(1/6)*(k1+2*k2+2*k3+k4);
end
disp(y);
z = eval(dsolve('Dy=3*x+y/2','y(xo)=yo','x'));
plot(x,y,'r',x,z,'*')
end

