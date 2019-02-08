package Thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class newCachedThreadPoolDemo {
  public static void main(String[] args) throws InterruptedException {
	  ExecutorService service = Executors.newCachedThreadPool();
	     for (int i = 0; i < 10; i++) {
			service.execute(() ->{
				
				try {
					TimeUnit.MICROSECONDS.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
				
			});
	    	 System.out.println(service);
	    	 TimeUnit.SECONDS.sleep(70);
	    	 System.out.println(service);
		}
	  
}
}
