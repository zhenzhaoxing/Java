package 观察模式;

import java.util.Observable;


public class ObserverImpl extends Observer1 {
	 int state;
	@Override
	public void Update(Subject subject) {//通知者的对象 用来获取 状态
	   state=((ConcreteSubject)subject).getState();
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}


}
