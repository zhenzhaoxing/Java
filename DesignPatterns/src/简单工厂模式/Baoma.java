package 简单工厂模式;

public class Baoma implements Car {

	@Override
	public void run() {
	System.out.println("宝马跑得快");

	}

	@Override
	public void add() {
 System.out.println("宝马 耗油");		
	}

}
