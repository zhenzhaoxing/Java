package shxi;

public class Cleak {
      int Conyy;
      
          public synchronized void addPro() throws InterruptedException {
        	   if(Conyy>=10) {
        		   wait();
        	   }
        	   else {
        		    Conyy++;
        		    System.out.println(Thread.currentThread().getName()+"生产者生产了"+Conyy);
        		     notifyAll();//通知其他线 没生产一个就要通知消费者 消费
        		       //
        	   }
          }
          
          
          
          public synchronized void   xiaofei() throws InterruptedException {
        	     if(Conyy<0) {
        	    	 wait();
        	     }
        	     else {
        	    	 System.out.println(Thread.currentThread().getName()+"消费者消费"+Conyy);
        	    	 Conyy--;//减掉一个就要唤醒其他线程 生产
        	    	 notifyAll();
        	     }
          }
          
          
}
