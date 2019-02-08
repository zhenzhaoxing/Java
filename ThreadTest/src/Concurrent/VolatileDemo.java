package Concurrent;

import java.util.concurrent.TimeUnit;

//volatile 关键字
public class VolatileDemo {

	 boolean flag = true;
    void m() {
        System.out.println("m start");
        while(flag) {
          try {
              TimeUnit.MILLISECONDS.sleep(10);
         } catch (InterruptedException e) {
             e.printStackTrace();
          }
        	
        }
        System.out.println(flag);
        System.out.println("m end!");
    }

    public static void main(String[] args) {
    	VolatileDemo t = new VolatileDemo();

        new Thread(t::m, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.flag = false;


    }
}
