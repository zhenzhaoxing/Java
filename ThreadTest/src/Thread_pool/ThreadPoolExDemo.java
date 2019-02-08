package Thread_pool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExDemo {
	public static void main(String[] args) {
		
	
  ThreadPoolExecutor d = new ThreadPoolExecutor(1, 2,3, TimeUnit.SECONDS, new LinkedBlockingQueue<>(3));
  
  for (int i = 0; i <5; i++) {
	 
	  d.execute(()->{
		     try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     System.out.println(Thread.currentThread().getName());
	  });
	  
}  
  System.out.println(d);
  
            d.shutdown();
	System.out.println(d.isTerminated());
	System.out.println(d.isShutdown());
        
	}
}
