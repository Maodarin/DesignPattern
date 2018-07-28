package darin.designPattern.Builder;

public class PersonBuilderOne extends PersonBuilder {

	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		System.out.println("Build Head");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		System.out.println("one Build Body");
	}

	@Override
	public void buildArmLeft() {
		// TODO Auto-generated method stub
		System.out.println("one Build ArmLeft");
	}

	@Override
	public void buildArmRight() {
		// TODO Auto-generated method stub
		System.out.println("one Build ArmRight");
	}

	@Override
	public void buildLegLeft() {
		// TODO Auto-generated method stub
		System.out.println("one Build LegLeft");
	}

	@Override
	public void buildLegRight() {
		// TODO Auto-generated method stub
		System.out.println("one Build LegRight");
	}

}
