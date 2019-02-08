package SellTicket;


import java.util.ArrayList;
import java.util.List;

public class DEmo1 {
  static   List<String> list = new ArrayList<>();
  
  
  static{
	    for (int i = 0; i < 10000; i++) {
			list.add("第"+i+"张票");
		}
	    
	    
	   
	    
	    
	    
  }
  public static void main(String[] args) {
	   
	    for (int i = 0; i < 10; i++) {
			  new Thread(()->{
				  
				  while(list.size()>0){
 synchronized (list) {
	

					  System.out.println(Thread.currentThread().getName()+"销售了"+list.remove(0));
				  }
				  }
				  
			  },"窗口"+i).start();
		}
	   
	  
	  
}
}
