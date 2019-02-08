package 类;

public class Student {
	//成员变量 属性
	int id;
    int age;
    String name;
   
    private Computer comp ;//计算机类
    //方法
    void study(){
    	System.out.println("我爱学习!!，使用电脑"+comp.brand);
    }
    void play(){
    	System.out.println("玩游戏");
    }
    
    
    //程序执行的入口 mian
    public static void main(String[] args) {
		//创建对象 stu1   new
    	Student stu1 = new Student();
    	stu1.id=1000;
    	stu1.name="甄兆星";
    	stu1.age=18;
    	
    	Computer c1= new Computer();
    			            c1.brand="联想";
    	stu1.comp=c1;
    	
    	stu1.play();
    	stu1.study();
//    	System.out.println(stu1.id);
	}
    
    
    
}


//定义一个另外的类 不能加public
class Computer{
	 String brand;
}

