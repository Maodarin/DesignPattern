package darin.designPattern.AbstractFactory;

public class AccessIUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("��Access���ݿ��в���һ������");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access���ݿ��в�ѯ��һ������");
		return null;
	}

}
