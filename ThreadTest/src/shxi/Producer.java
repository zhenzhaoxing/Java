package shxi;

public class Producer implements Runnable{
	 Cleak c =  new Cleak();
		
		public  Producer(Cleak c) {
			this.c=c;
		}
	@Override
	public void run() {
		 while(true) {
			  try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		try {
			c.addPro();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 }
	}
  
}
