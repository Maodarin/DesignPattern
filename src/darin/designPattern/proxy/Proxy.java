package darin.designPattern.proxy;

public class Proxy implements GiveGift {
	private Pursuit pursuit;
	public Proxy(Pursuit pursuit){
		this.pursuit = pursuit;
	}
	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		pursuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		pursuit.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		pursuit.GiveChocolate();
	}

}
