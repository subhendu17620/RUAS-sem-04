function [] = oneD_heat(t0,tn,x0,xm,h,k,c)

 t= t0:k:tn;
 x= x0:h:xm;
 m=length(x);
 n=length(t);
 a=c*k/h^2;
 f= @(x) sin(pi*x);
u= zeros(m,n);
u(:,1)=f(x);
for (j=1:n-1)
    for i=2:m-1
        u(i,j+1)=a*u(i-1,j)+(1-2*a)*u(i,j)+a*u(1+i,j);
    end
end
surf(t,x,u);
xlabel('t');
ylabel('x');
zlabel('u');
end

