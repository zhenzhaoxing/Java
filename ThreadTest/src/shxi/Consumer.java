package shxi;

public class Consumer  implements Runnable {
 Cleak c =  new Cleak();
	
	public Consumer(Cleak c) {
		this.c=c;
	}
	
	@Override
	public void run() {
		 while(true) {
		try {
			c.xiaofei();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
	}

}
