package 简单工厂模式;

public class Client2 {

	public static void main(String[] args) {
	
		
	

		Car c1 = CarFactory.createCar("宝马");
		Car c2 = CarFactory.createCar("保时捷");
		c1.run();//宝马跑得快
		c2.run();//保时捷好看
		c1.add();
		
		
		Car car = CarFactory.createCar("宝马");
		 //System.out.println(c1==car);
	}

}
