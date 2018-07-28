package darin.designPattern.AbstractFactory;

public class AccessServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new AccessIUser();
	}

}
