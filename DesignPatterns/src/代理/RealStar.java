package 代理;

public class RealStar implements Star {

	@Override
	public void see() {
		System.out.println("唱歌");
		
	}

	@Override
	public void sleep() {
		System.out.println("睡觉");
	}

}
