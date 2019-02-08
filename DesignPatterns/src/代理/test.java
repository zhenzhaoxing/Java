package 代理;

import java.lang.reflect.Proxy;

public class test {
    public static void main(String[] args) {
    	
    	
    	RealStar s1 = new RealStar();
       
    	System.out.println(s1.getClass());
		StarHandler s = new StarHandler(s1);//实现接口的类 把要代理的传过去
		//类加载器
		// class $Proxy0   内存中动态生成的代理对象
		Star  star = (Star)s.getProxy();
		System.out.println(star.getClass());
		star.see();
		star.sleep();
		
    }
    
}
