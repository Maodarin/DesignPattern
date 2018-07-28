package darin.designPattern.AbstractFactory;

public class SQLServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new SqlServerIUser();
	}

}
