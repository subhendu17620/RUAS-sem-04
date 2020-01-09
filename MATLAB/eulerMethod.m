%solve dy/dx = x+2y , y(0)=1 , using Euler's Method by taking h=0.1 and
%find y(0.4) ???
function [ ] = eulerMethod(x0,y0,xn,h)
x=x0:h:xn;
n=length(x);
y(1)=y0;
f=@(x,y) (x+2*y);

for i=2:n
    y(i)=y(i-1)+h*f(x(i-1),y(i-1));
end
fprintf('the approximate value of y at x is y(%f)=%f \n',x(end),y(end));

z=eval(dsolve('Dy=x+2*y','y(0)=1','x'));
plot(x,y,'r',x,z,'k');
legend('Approximate Value','Exact Value');
end

    