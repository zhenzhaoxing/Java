package THreadLocal;

import java.util.concurrent.TimeUnit;

public class Demo {

	static ThreadLocal<Person> p = new ThreadLocal<>();
	//volatile static Person p = new Person();
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
               System.out.println(p.get());   
			}
		
		}).start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
             p.set(new Person());
			}
		
		}).start();
		
	}
}

class Person {
	String name = "zhangsan";
}
