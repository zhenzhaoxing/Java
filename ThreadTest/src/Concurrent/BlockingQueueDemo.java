package Concurrent;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo {
  
	static BlockingQueue<String> str = new LinkedBlockingQueue<>();
	static Random r = new Random();
	public static void main(String[] args) {
	       new Thread( new Runnable() {
			
			@Override
			public void run() {
				      for (int i = 0; i < 100; i++) {
						 try {
							str.put("a"+i);
							TimeUnit.MILLISECONDS.sleep(r.nextInt(1000));
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}
		}).start();
	       
	       for (int x = 0; x < 5; x++) {
	       new Thread( new Runnable() {
	       @Override
			public void run() {
				  
					
				for(;;){
						 try {
							System.out.println(Thread.currentThread().getName()+"take"+str.take());
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				   }
			}
		},"a"+x).start();
	       
	}
}
}
