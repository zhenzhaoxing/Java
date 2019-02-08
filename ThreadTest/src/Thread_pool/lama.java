package Thread_pool;

import java.util.concurrent.TimeUnit;

public class lama {
           public static void main(String[] args) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int i = 0; i < 10; i++) {
						
					
                  System.out.println("syso");	
                  try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					}
				}
			}).start();
			
			
			
	                new Thread(() -> 
						
	                	   System.out.println("afsikjbsbkbk")
	                
	                
	               ).start();
                  
				
			
	
			
			
			
		}
}
