package 观察模式;

import java.util.ArrayList;
import java.util.List;

//保存观察者的抽象类
interface  Subject {


	public void add(Observer1 ob);
          
	
	//移除观察者
	public void remove(Observer1 ob);
	
	public void notifyObserver();
	}

