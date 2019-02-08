package shxi;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo2 {
             //用lock锁的方式来生成和消费
	
	
	 Lock lock = new   ReentrantLock();
	    private Condition producer = lock.newCondition();
		private Condition consumer = lock.newCondition();
		int Conyy;

	public   void  add() throws InterruptedException{
		
		try {
			lock.lock();
			  while(Conyy>=10){
				  producer.await();
			  }
			  Conyy++;
			  System.out.println(Thread.currentThread().getName()+Conyy);  
			    //通知消费者
			  consumer.signalAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		
	
	
	
	
	}
		
	
	   
	
	
public   void  xiaofei() throws InterruptedException{
		
		try {
			lock.lock();
			  while(Conyy<0){
				  producer.await();
			  }
			  
			  System.out.println(Thread.currentThread().getName()+Conyy);
			  Conyy--;
			    //通知消费者
			  consumer.signalAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			    lock.unlock(); 
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Demo2   d = new Demo2();        
		new Thread(new Runnable() {
					
					@Override
					public void run() {
						while(true){
						try {
							d.add();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
					}
					}
				},"生产者").start();
		
		
		
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
				try {
					d.xiaofei();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}						
			}
			}
		},"消费者").start();
		
		
		
		
		
		
	}
}
