package darin.designPattern.AbstractFactory;

public class SqlServerIProduct implements IProduct {

	@Override
	public void insert(Product  product) {
		// TODO Auto-generated method stub
		System.out.println("��sqlserver���ݿ��в���һ��Product����");
	}

	@Override
	public Product getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��sqlserver���ݿ��в�ѯ��һ��product����");
		return null;
	}

}
