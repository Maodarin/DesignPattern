package darin.designPattern.factory;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		double result = 0;
		result = this.getNumberA()*this.getNumberB();
		return result;
	}

}
