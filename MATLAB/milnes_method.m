function [x,y] = milnes_method(x0,y0,xn,h)

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
for i=4:n-1
    y(i-1)=y(i-3)+(4*h/3)*(2*f(x))
for j=1:maxit
    y(i+1) = y(y-1)+(h/3)*f(x(i-1),,y(i-1)+4*f(x(i),y(i))+f(x(i+1),yp);
if abs(yp-y(i+1)<tol
break;
end
yp=y(i+1);
end
end
plot(x,y,'r--')
end

