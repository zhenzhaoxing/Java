package Vo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test001 {
	  public static void main(String[] args) {
   	               final testB t = new testB();
   	              //synchronized 关键字 是锁着的对象
   	               final Object lock = new Object();
		    
   	               
   	               
   	               new  Thread(new Runnable() {
					
					@Override
					public void run() {
						synchronized (lock) {
						
							  if(t.getSize()!=5){
								 try {
									lock.wait();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							  }
							  System.out.println("is 5");
							  lock.notifyAll();
							 
						}
					}
				}).start();
   	               
                 new  Thread(new Runnable() {
					
					@Override
					public void run() {
						synchronized (lock) {
						 for (int i = 1; i < 11; i++) {
						     t.add(i);
						     System.out.println(i);
						     if(t.getSize()==5){
						    	 lock.notifyAll();
						    	 try {
									lock.wait();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						    	 try {
									TimeUnit.SECONDS.sleep(1);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						     }
						}
						}
					}
				}).start();
   	               
   	               
	  
   	           
   	               
   	               
	  /*  new Thread(()->{
	    	synchronized (lock) {
			   if(t.getSize()!=5){
				   try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   
				   System.out.println("is 5");
				   lock.notifyAll();
			   }
			}
	    	
	    	
	    	
	    }).start();
	  
	  
	  
	
	  
	    new Thread(()->{
 	   		  
 	   		  synchronized (lock) {
 	   			   for (int i = 0; i < 10; i++) {
 	   				   System.out.println(i);
 	   				   t.add(i);
 	   				if(t.getSize()==5){
 	   					try {
 	   						lock.notifyAll();
 	   						lock.wait();
 	   					} catch (InterruptedException e) {
 	   						// TODO Auto-generated catch block
 	   						e.printStackTrace();
 	   					}
 	   					try {
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
 	   					
 	   					
 	   				}
 	   				   
 	   			}
 	   		}
 	   		  
 	   		  
 	   	  }).start();*/
	  
	  
	  
	  }
	  

	  
	    
	    

	  
	     
	  
}


class testB{
volatile List<Integer> arr = new ArrayList<>();


 public void add(int i){
	  arr.add(i);
 }
 public int getSize(){
	  return arr.size();
 }
}