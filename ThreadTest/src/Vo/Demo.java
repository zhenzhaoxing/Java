package Vo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

public class Demo {
         
	
	
	       public static void main(String[] args) {
	    	   testA t = new testA();
			      new Thread(new Runnable() {
					
					@Override
					public void run() {
						for (int i = 1; i < 11; i++) {
                 System.out.println(i);
							t.add(i);
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					}
				}).start();
	    	   
			      new Thread(new Runnable() {
						 
						@Override
						public void run() {
							 while(true){
								 //System.out.println("-----------------");
						if(t.getSize()==5){
							System.out.println("是五");
							break;
							
						}
						}
						}
						
					}).start();
	    	   
		}
	
	
}


class testA{
	volatile List<Integer> arr = new ArrayList<>();
	
	
	  public void add(int i){
		  arr.add(i);
	  }
	  public int getSize(){
		  return arr.size();
	  }
}