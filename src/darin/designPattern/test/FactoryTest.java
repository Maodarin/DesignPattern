package darin.designPattern.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import darin.designPattern.factory.Operation;
import darin.designPattern.factory.OperationFactory;


public class FactoryTest {
	double numberA = 20;
	double numberB = 10;
	@Before
	public void setNumber(){
		System.out.println("Start test");
	}
	
	@Test
	public void testOperation() {
		Operation oper = OperationFactory.createOperate("/");
		oper.setNumberA(numberA);
		oper.setNumberB(numberB);
		try {
			double result = oper.getResult();
			System.out.println(numberA+" "+ oper +" "+ numberB+"="+result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("numberB ²»ÄÜžéÁã");
		}
	}
	
	@After
	public void testFinish() {
		System.out.println("Start finish");
	}

}
