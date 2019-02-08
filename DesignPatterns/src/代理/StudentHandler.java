package 代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StudentHandler implements  InvocationHandler {
              Object target;
	
	public StudentHandler(Object target){
		this.target=target;
	}
	
	
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("每天吃饭");
		
		method.invoke(target, args);
		System.out.println("下课"+this);
		return null;
	}
     
	
	public  Object   getProxy(){  //类加载器        类接口
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		
	}
	
}
