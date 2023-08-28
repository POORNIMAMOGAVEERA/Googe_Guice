package drawApp;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class InterceptorFun implements MethodInterceptor{
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before Invocation"+invocation.getMethod().getName());
		Object result = invocation.proceed();
		System.out.println("After Invocation"+invocation.getMethod().getName());
		return result;
	}
}
