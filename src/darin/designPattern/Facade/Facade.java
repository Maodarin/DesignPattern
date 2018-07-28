package darin.designPattern.Facade;

public class Facade {
	SystemOne one;
	SystemTwo two;
	SystemThree three;
	SystemFour four;
	
	public Facade() {
		one = new SystemOne();
		two = new SystemTwo();
		three = new SystemThree();
		four = new SystemFour();
	}
	
	public void MethodA() {
		one.methodOne();
		four.methodOne();
	}
	
	public void MethodB() {
		two.methodOne();
		three.methodOne();
	}
	
}
