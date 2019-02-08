package 代理;

import java.lang.reflect.Proxy;

public class Demo {
      public static void main(String[] args) {
		
    	    person stu = new Student();
    	    //需要代理的对象传过去
    	     StudentHandler studentHandler = new  StudentHandler(stu);
    	     
    	 
    	     person p = (person) studentHandler.getProxy();
    	     p.renwu();
	}
}
