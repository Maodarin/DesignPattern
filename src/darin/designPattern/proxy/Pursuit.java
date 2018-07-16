package darin.designPattern.proxy;

public class Pursuit implements GiveGift {
	private SchoolGirl girl;
	public Pursuit(SchoolGirl girl) {
		this.girl = girl;
	}
	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+"ËÍÄãÑóÍŞÍŞ");
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+"ËÍÄã»¨");
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+"ËÍÄãÇÉ¿ËÁ¦");
	}

}
