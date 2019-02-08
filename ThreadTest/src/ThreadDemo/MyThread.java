package ThreadDemo;
//这是实现接口创建的线程
public class MyThread implements  Runnable {
	int num=100;
	
	
	public void run() {
       while(true){
    	   if(num<=0){
    		   break;//结束整个循环
    	   }
    	   try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   System.out.println(Thread.currentThread().getName()+"强到了"+num--);
       }
		
	
		
		
		
	}
}

  class Test{
	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread t1 = new Thread(m,"甄兆星");
		Thread t2= new Thread(m,"张灵甫");
		Thread t3 = new Thread(m,"章子怡");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
