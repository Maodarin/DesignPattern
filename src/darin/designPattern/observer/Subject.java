package darin.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	public void nodify() {
		for(int i=0;i<observers.size();i++){
			observers.get(i).update();
		}
	}

}
