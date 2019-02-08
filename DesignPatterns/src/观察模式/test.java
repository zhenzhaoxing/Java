package 观察模式;

public class test {
public static void main(String[] args) {
	//发布者 通知者
	ConcreteSubject con = new ConcreteSubject();
	
	//观察者们
	ObserverImpl o1= new ObserverImpl();
	ObserverImpl o2= new ObserverImpl();
	ObserverImpl o3= new ObserverImpl();
	con.add(o1);
	con.add(o3);
	con.add(o2);
	con.setState(600);

	System.out.println(o1.getState());
	System.out.println(o2.getState());
	System.out.println(o3.getState());
}
}
