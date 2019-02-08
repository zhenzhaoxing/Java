package cblib代理;

import java.lang.reflect.Method;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class mishu implements MethodInterceptor{
	   
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("66666666666666");
		arg3.invokeSuper(arg0,arg2);
		System.out.println("like you");
		return null;
	}

}
