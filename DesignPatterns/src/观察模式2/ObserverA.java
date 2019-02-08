package 观察模式2;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

	private String myState;
	@Override
	public void update(Observable o, Object arg) {
		myState = ((ConcreteSubject)o).getState();

	}
	public String getMyState() {
		return myState;
	}
	public void setMyState(String myState) {
		this.myState = myState;
	}

	
	
	
	
}
