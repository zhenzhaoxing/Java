package Thread_method;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class MyThread1<T> {
	final private  LinkedList<T>  lists = new LinkedList<>();
	              final private int max=10;
              int count = 0;
              Lock lock = new ReentrantLock();
              Condition producer= lock.newCondition();
              Condition consumer= lock.newCondition();
              
              public T get(){
            	  T t =null;
                           
                try {
                	 lock.lock();    
					while(lists.size()==0){
						consumer.await();
					}
					 t = lists.removeFirst();
					 count--;//先运算 在减除
					producer.signalAll();
				} catch (Exception e) {
					// TODO: handle exception
				}finally {
					lock.unlock();
				}
              return t;
              }
              
              
              //生产者
              public void set(T t){
            	  try{
            	   lock.lock();
            	   while(lists.size()==max){
            		  
						producer.await();
					} 
            	   
             	    lists.add(t);
             	   ++count;
             	         consumer.signalAll();
              
              }catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						lock.unlock();
					}
            	   
            	 
            	  
}
              
              
              
              public static void main(String[] args) {
            	  MyThread1<String> c = new MyThread1<>();
			  for (int i = 0; i <3; i++) {
				
			
            	  new Thread( ()-> {
			
							for (int x = 0;x < 20; x++) {
								c.set(x+"Thread.currentThread().getName()");
							}
					},"生产者").start();
			  }
						
				for(int i=0; i<3; i++) {
                           new Thread( ()->{
							System.out.println(c.get()+Thread.currentThread().getName());
					
					},"消费者").start();
			}
              
              }
}