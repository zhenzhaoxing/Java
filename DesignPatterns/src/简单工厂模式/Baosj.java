package 简单工厂模式;

public class Baosj implements Car {

	@Override
	public void run() {
		System.out.println("保时捷好看");

	}

	@Override
	public void add() {
System.out.println("保时捷不耗油");		
	}

}
