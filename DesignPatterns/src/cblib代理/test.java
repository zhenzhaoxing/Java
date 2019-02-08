package cblib代理;

import net.sf.cglib.proxy.Enhancer;

public class test {
	public static void main(String[] args) {

		// 自己的类
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CEO.class);
		enhancer.setCallback(new mishu());
		CEO ceo = (CEO) enhancer.create();
		ceo.play();
	}
}
