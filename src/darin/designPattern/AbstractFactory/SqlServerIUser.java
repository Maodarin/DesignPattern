package darin.designPattern.AbstractFactory;

public class SqlServerIUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("��sqlserver���ݿ��в���һ������");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��sqlserver���ݿ��в�ѯ��һ������");
		return null;
	}

}
