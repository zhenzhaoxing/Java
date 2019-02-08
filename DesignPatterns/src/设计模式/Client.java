package 设计模式;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
	System.out.println("-------------飞行功能---==");
	FlyCar flyCar = new FlyCar(car);
	flyCar.move();
	
	
	System.out.println("-------------两个功能---==");
	FlyCar flyCar1 = new FlyCar(car);
	WaterCar waterCar2 = new WaterCar(flyCar1);
	//一环套一环
	waterCar2.move();
	
	
	
	
	}

}
