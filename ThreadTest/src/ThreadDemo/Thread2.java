package ThreadDemo;

class Thread2 implements Runnable {

	int sum =50;
       boolean falg=true;
	public void run() {
		while (falg) {
			try {
				demo2();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//这是加锁的方法 把 syncronized去掉就是不加锁
	   public  synchronized void demo() throws Exception {
		  if(sum<=0) {
			  falg=false;
			  return;
		  }
		    Thread.sleep(100);
		    System.out.println(Thread.currentThread().getName() +sum--);
	    }
	
	
	   //把锁加方法内
	   
	   
	   public   void demo2() throws Exception {
		   synchronized (this) {
			  if(sum<=0) {
				  falg=false;
				  return;
			  }
			 
				  Thread.sleep(100);
				    System.out.println(Thread.currentThread().getName() +sum--);
				    if(sum==2) {
				    	System.out.println("礼让");
				    	Thread.currentThread().yield();
				    }
			}
			    
		    }
	   
	   
	
	public static void main(String[] args) {
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2, "张三");
		Thread t1 = new Thread(t2, "李四");
		Thread t3 = new Thread(t2, "王五");
		/* t.setPriority(Thread.MAX_PRIORITY);优先级 */
		t.start();
		t1.start();
		t3.start();
		System.out.println(t1.isAlive());
	}
}
