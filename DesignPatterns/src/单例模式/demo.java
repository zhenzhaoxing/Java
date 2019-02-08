package 单例模式;

public class demo {
  public static void main(String[] args) {
	     
	  SingleDemo demo1 = SingleDemo.getSing();
	  demo1.setAge(187);
	  demo1.setName("ndnd");
	  System.out.println(demo1.getAge());
	  
	  SingleDemo demo2 = SingleDemo.getSing();
	  demo2.setAge(17);
	  System.out.println(demo2.getAge());
	  System.out.println(demo1==demo2);
	  System.out.println( demo1.getAge());
  
  
  
  
  }
}
