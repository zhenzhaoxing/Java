package shxi;

public class Demo {
	public static void main(String[] args) {
		

  Cleak c = new Cleak();
  
  
   Producer p = new Producer(c);
   Consumer co = new Consumer(c);
		   Thread t = new Thread(p,"生产￥￥");
		   Thread t2 = new Thread(p,"生产￥￥");
		   Thread t1 = new Thread(co,"消费￥￥");
		    t.start();
		    t2.start();
		    t1.start();
}
}