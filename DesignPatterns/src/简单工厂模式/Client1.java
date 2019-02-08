package 简单工厂模式;

public class Client1 {
	/*
	 * 在没有工厂模式下
	 */
	public static void main(String[] args) {
		Baosj b1 = new Baosj();
		Baoma b2 = new Baoma();
		b1.run();
		b2.run();
	   /*保时捷好看
		宝马跑得快*/
	
	  //有工厂模式得情况下 为
		      
	  Car createCar = CarFactory.createCar("宝马");
	        createCar.run();
	}
        
	
}
