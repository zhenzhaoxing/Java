package 代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarHandler implements InvocationHandler{
        public Star target;
        public StarHandler(Star target) {
			this.target=target;
		}
        //增强器 在
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("点饭");
		method.invoke(target, args);
		System.out.println("付款"+this);
		return null;
		
	}
	
	
	 public Object getProxy(){
		 //在内存中动态生成对象
    	 //目标对象的 类加载器   获取实现类实现的接口 star     代理接口StarHandler
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    	 
     }
}
