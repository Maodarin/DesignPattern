package darin.designPattern.AbstractFactory;

public class AccessIUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("像Access数据库中插入一条数据");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access数据库中查询到一条数据");
		return null;
	}

}
