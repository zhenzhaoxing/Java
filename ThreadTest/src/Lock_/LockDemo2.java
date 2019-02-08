package Lock_;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo2 extends Thread{
	//公平锁
		public static  ReentrantLock lock = new ReentrantLock(true);//公平锁


	@Override
	public void run() {
     while(true){
    	  lock.lock();
    	 try{
            
              System.out.println(Thread.currentThread().getName()+"获得的锁");
              try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      }finally{
    	  lock.unlock();
      }
    	 
     
     }
	}
	
	
	public static void main(String[] args) {
		LockDemo2 l = new LockDemo2();
		
		new Thread(l,"T1").start();
		new Thread(l,"T2").start();
		
	}
	
}