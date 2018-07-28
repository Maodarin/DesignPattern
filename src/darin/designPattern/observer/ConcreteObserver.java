package darin.designPattern.observer;

public class ConcreteObserver extends Observer{
	private String name;
	private String observerState;
	private ConcreteSubject subject;
	
	public ConcreteObserver(String name,ConcreteSubject subject) {
		this.name=name;
		this.subject=subject;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.observerState=subject.getSubjectState();
		System.out.println(String.format("观察者%s的新状态是%s", name,observerState));

	}

}
