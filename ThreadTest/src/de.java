import java.util.concurrent.TimeUnit;

public class de {
	   static Integer i = 0;
	   final static int TOTAL = 100; 
	   public static void main(String[] args) {
		   Object lock = new Object();
	  
	   
	     
	     new  Thread(new Runnable() {
			
			@Override
			public void run() {
			                 synchronized (lock) {
			                	 while(i<TOTAL){
			                		   if(i%2==1){
			                			   System.out.println(Thread.currentThread().getName() + i++);
			                			   try {
											TimeUnit.SECONDS.sleep(1);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
			                		   }else{
			                			   lock.notifyAll();
			                			   if(i<TOTAL){
			                				   try {
			                					   lock.wait();
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
			                			   }
			                		   } 		   
			                	 }
							}
				
			}
		},"我是奇数").start();
	   
	     new  Thread(new Runnable() {
				
				@Override
				public void run() {
				      synchronized (lock) {
						   
		                	 
		                	 while(i<TOTAL){
		                		   if(i%2==0){
		                			   System.out.println(Thread.currentThread().getName() + i++);
		                		  
		                			   try {
										TimeUnit.SECONDS.sleep(1);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
		                		   }else{
		                			   lock.notifyAll();		   
		                			   if(i<TOTAL){
		                				   try {
		                					   lock.wait();
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
		                			   }
		                		   }
		                		   
		                		   
		                	 }
						}
			
		}
			},"我是偶数").start();
	     
	     
	     
	     
	     
	     
	     
	   }
}
				 
			