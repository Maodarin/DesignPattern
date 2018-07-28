package darin.designPattern.AbstractFactory;

public class AccessIProduct implements IProduct {

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		System.out.println("像Access数据库中插入一条Product数据");
	}

	@Override
	public Product getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access数据库中查询到一条product数据");
		return null;
	}

}
