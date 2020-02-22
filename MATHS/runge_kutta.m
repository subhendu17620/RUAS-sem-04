function [] = runge_kutta( f,yo,xo,h,xn )
x= xo:h:xn;
n = length(x);
y = zeros(1,n);
y(1) = yo;
for i = 2:n
    k1 = h*f(x(i-1),y(i-1));
    k2 = h*f(x(i-1)+h/2,y(i-1)+k1/2);
    k3 = h*f(x(i-1)+h/2,y(i-1)+k2/2);
    k4 = h*f(x(i-1)+h,y(i-1)+k3);
    y(i) = y(i-1) + 1/6*(k1+2*k2+2*k3+k4);
end
z = eval(dsolve('Dy=x^3+y','y(0)=1','x'));
fprintf("numerical solution: ");
disp(y)
fprintf("exact solution: ");
disp(z);
plot(x,y,'r',x,z,'k*')
end

