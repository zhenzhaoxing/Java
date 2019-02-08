package Lock_;

import java.util.concurrent.TimeUnit;
//synchronized
public class demo {
	synchronized  void m1(){
            	for (int i = 0; i <10; i++) {
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
            }
            
	synchronized   void m2(){
            	 System.out.println("m2----");
             }
           
	synchronized   void m3(){
            	 String [] arr ={"是是是","搜索","首付款","空"};
            	 for (String string : arr) {
					System.out.println(string);
				}
             }
           
           
           //一个方法执行后 在执行另一个方法
            public static void main(String[] args) {
				     demo d = new demo();
				     
				     new Thread(d::m1).start();
				     try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				     new Thread(d::m2).start();
				     new Thread(d::m3).start();
			}
}
