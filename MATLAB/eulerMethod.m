function [ ] = eulerMethod(x0,y0,xn,h,f)
x=x0:h:xn;
n=length(x);
y(1)=y0;

for i=2:n
    y(i)=y(i-1)+h*f(x(i-1),y(i-1));
end
fprintf('the approximate value of y at x is y(%f)=%f \n',x(end),y(end));
plot(x,y)
end

