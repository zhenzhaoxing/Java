package blocking;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class T05_LinkedBlockingQueue{
      static BlockingQueue<String> strs = new LinkedBlockingQueue<>(5);
   Random r = new Random();
   public static void main(String[] args) {
	  new Thread(()->{
		  for(int i=0;i<100;i++){
			 try {
				strs.put("a"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		  }
	  },"p1").start();
	  
	  for (int i = 0; i < 5; i++) {
 new Thread(()->{
	   for (;;) {
			try {
				System.out.println(Thread.currentThread().getName() + " take -" + strs.take()); //如果空了，就会等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	   }
	  }).start();
	  
}
   }
}
