package darin.designPattern.AbstractFactory;

public class AccessIProduct implements IProduct {

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		System.out.println("��Access���ݿ��в���һ��Product����");
	}

	@Override
	public Product getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access���ݿ��в�ѯ��һ��product����");
		return null;
	}

}
