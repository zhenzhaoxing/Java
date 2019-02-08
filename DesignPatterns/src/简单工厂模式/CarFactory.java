package 简单工厂模式;
//创造车的工厂
public class CarFactory {
      // static Baoma b ;
	public static Car createCar(String type){
		
		if("宝马".equals(type)){
			Baoma b = new Baoma();
			return b;
		}
		else if("保时捷".equals(type)){
			return new Baosj();
		}
		else{
			return null;
		}
	}
	
}
