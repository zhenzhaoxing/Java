package 设计模式;
//接口
public interface ICar {
void move();
}

//类实现
class Car implements ICar{


	public void move() {
		System.out.println("在陆地跑");
		
	}
	
}

//装饰角色
class SuperCar implements ICar{
protected  ICar car;  
	
 public SuperCar(ICar car) {
	super();
	this.car=car;
	
}

	@Override
	public void move() {
	car.move();
		
	}
	
}






class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
		
	}
	public void fly(){
		System.out.println("天上飞");
	}
	
	public void move(){
		super.move();
		fly();
	}
			
}


class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
	//this.car=car;
	}
	public void swim(){
		System.out.println("s水里游");
	}
	
	
	public void move(){
		super.move();//父类的move 也就是flyCar
		swim();
	}
			
}










class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
		
	}
	public void autoMove(){
		System.out.println("自动驾驶");
	}
	
	public void move(){
		super.move();
		autoMove();
	}
			
}

