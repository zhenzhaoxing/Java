package 类;

public class SuperDemo {
	public static void main(String[] args) {
		

        Student1 s = new Student1();
              s.move();
	}
}




class  Person{
	
	public void eat(){
		System.out.println("人会吃饭");
	}
}



class Student1 extends Person{

	public void move(){
		super.eat();//调用父类的方法
	}
	
	
}