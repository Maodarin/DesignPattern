package darin.designPattern.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import darin.designPattern.Template.AbstractClass;
import darin.designPattern.Template.ConcreteClassA;
import darin.designPattern.Template.ConcreteClassB;
import darin.designPattern.decorator.Component;
import darin.designPattern.decorator.ConcreteComponent;
import darin.designPattern.decorator.Decorator;
import darin.designPattern.decorator.DecoratorA;
import darin.designPattern.decorator.DecoratorB;
import darin.designPattern.factory.Operation;
import darin.designPattern.factory.OperationFactory;
import darin.designPattern.prototype.Resume;
import darin.designPattern.proxy.Proxy;
import darin.designPattern.proxy.Pursuit;
import darin.designPattern.proxy.SchoolGirl;


public class DesignPatterTest {
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
			System.out.println("numberB 不能為零");
		}
	}
	
	@Test
	public void testDecorator() {
		Component component = new ConcreteComponent();
		Decorator  decoratorA = new DecoratorA();
		decoratorA.setComponent(component);
		Decorator  decoratorB = new DecoratorB();
		decoratorB.setComponent(decoratorA);
		decoratorB.Operation();
	}
	
	@Test
	public void testProxy() {
		SchoolGirl girl = new SchoolGirl();
		girl.setName("如花");
		Pursuit pursuit = new Pursuit(girl);
		Proxy proxy = new Proxy(pursuit);
		proxy.GiveDolls();
		proxy.GiveFlowers();
		proxy.GiveChocolate();
	}
	@Test
	public void testProtoType() {
		Resume resume = new Resume("xiaoming");
		resume.setPersonInfo("boy",25 );
		resume.setWorkExperience("2015.06-2016.07","携程");
		
		Resume r1 = (Resume) resume.Clone();
		r1.setWorkExperience("2018.08-2018.09", "阿里");
		
		Resume r2 = (Resume) resume.Clone();
		r2.setWorkExperience("2018.08-2018.09", "腾讯");
		
		resume.Display();
		r1.Display();
		r2.Display();
		
	}
	@Test
	public void testTemplate() {
		AbstractClass  a = new ConcreteClassA();
		a.TemplateMethod();
		AbstractClass  b = new ConcreteClassB();
		b.TemplateMethod();
	}
	@After
	public void testFinish() {
		System.out.println("Start finish");
	}

}
