package SellTicket;

import java.util.Random;

public class Test {
  public static void main(String[] args) {
       int t=  (int)(Math.random()*100)+1;
       Random random = new Random();
       int randomNumber1= random.nextInt(100);
       for (int i = 0; i < 20; i++) {
    	   System.out.println(t);
	}
	
}
}
