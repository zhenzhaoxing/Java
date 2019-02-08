package 单例模式;

public class SingleDemo {
              
	
	private SingleDemo(){
		
	}
	
	private int age;
	private String name;
	
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	private static  SingleDemo sing ;
	
	
	public static SingleDemo getSing(){
		
		
		if(sing==null){
		synchronized (SingleDemo.class) {
		 if(sing==null){
			  sing = new SingleDemo();
		 }
		}
		}
		 return sing; 
	 }

	
	
}
