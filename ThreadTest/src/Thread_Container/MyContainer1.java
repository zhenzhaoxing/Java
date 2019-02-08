package Thread_Container;
/**
 * 面试题：写一个固定容量同步容器，拥有put和get方法，以及getCount方法，
 * 能够支持2个生产者线程以及10个消费者线程的阻塞调用
 */

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class MyContainer1<T> {
	
	 final private  LinkedList<T>  arr = new LinkedList<>();
	final private int MAX = 10;
	int count = 0;
	private Lock lock = new ReentrantLock();
	//生产者
	private Condition producer = lock.newCondition();
	//消费者
	private Condition consumer = lock.newCondition();
                              
    
     
	// 生产
	void put(T i) {
		try {
		lock.lock();
		while (arr.size() == MAX) {
			
				producer.await();
			} 
		arr.add(i);
		++count;
		consumer.signalAll();//通知消费者来消费

		
		}		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
		

		
	}
	// 消费

	public T get() {
		T t=null;
		try {
			lock.lock();
		while (arr.size() == 0) {
			
				consumer.await();
			} 
		t= arr.removeFirst();
		count--;//先运算 在减除
		producer.signalAll();
		
	
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
		return t;
		
		

	}

	public static void main(String[] args) {
		MyContainer1<String> c = new MyContainer1<>();
		//启动消费者线程
				for(int i=0; i<10; i++) {
					new Thread(()->{
						for(int j=0; j<5; j++) System.out.println(c.get());
					}, "c" + i).start();
				}
				
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//启动生产者线程
				for(int i=0; i<2; i++) {
					new Thread(()->{
						for(int j=0; j<25; j++) c.put(Thread.currentThread().getName() + " " + j);
					}, "p" + i).start();
				}
			}
		}