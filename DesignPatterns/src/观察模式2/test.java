package 观察模式2;

public class test {

	public static void main(String[] args) {
		
		//创建目标对象Obserable
	ConcreteSubject subject = new ConcreteSubject();
		
		
	ObserverA obs1 = new ObserverA();
	ObserverA obs2 = new ObserverA();
	ObserverA obs3 = new ObserverA();

	//将上面三个观察者对象添加到目标对象subject的观察者容器中
	subject.addObserver(obs1);
	subject.addObserver(obs2);
	subject.addObserver(obs3);
	
	//改变subject对象的状态
	subject.setState("听令");
	System.out.println("===============状态修改了！");
	//观察者的状态发生了变化
	System.out.println(obs1.getMyState());
	System.out.println(obs2.getMyState());
	System.out.println(obs3.getMyState());

	subject.setState("chufa");
	System.out.println("===============状态修改了！");
	//观察者的状态发生了变化
	System.out.println(obs1.getMyState());
	System.out.println(obs2.getMyState());
	System.out.println(obs3.getMyState());		
	
}
}
