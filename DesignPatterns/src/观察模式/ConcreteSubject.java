package 观察模式;

import java.util.ArrayList;
import java.util.List;

//保存观察者的抽象类
public class ConcreteSubject implements Subject{
	List<Observer1> lista = new ArrayList<>();
	//添加 观察者的对象
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//主题对象(目标对象)值发生了变化，请通知所有的观察者
	    this.notifyObserver();
	}

	@Override
	public void add(Observer1 ob) {
	lista.add(ob);
		
	}

	@Override
	public void remove(Observer1 ob) {
	lista.remove(ob);
		
	}

	@Override
	public void notifyObserver() {
		for (Observer1 obs : lista) {
			obs.Update(this);//通知观察者们更新状态
		}
		
	}
	
	
	
}
