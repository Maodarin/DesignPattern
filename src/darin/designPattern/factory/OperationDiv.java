package darin.designPattern.factory;

public class OperationDiv extends Operation {

	@Override
	public double getResult() throws Exception {
		// TODO Auto-generated method stub
		double result = 0;
		if(this.getNumberB()== 0)
			throw new Exception("��������Ϊ��");
		result = this.getNumberA()/this.getNumberB();
		return result;
	}

}
