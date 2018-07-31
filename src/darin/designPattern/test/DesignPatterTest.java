package darin.designPattern.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.darin.proxy.InvocationHandler;
import com.darin.proxy.usertest.TransactionHandler;
import com.darin.proxy.usertest.UserMrg;
import com.darin.proxy.usertest.UserMrgImpl;

import darin.designPattern.AbstractFactory.DataAccess;
import darin.designPattern.AbstractFactory.IUser;
import darin.designPattern.AbstractFactory.User;
import darin.designPattern.Builder.BuildLeader;
import darin.designPattern.Builder.PersonBuilder;
import darin.designPattern.Builder.PersonBuilderOne;
import darin.designPattern.Builder.PersonBuilderTwo;
import darin.designPattern.Facade.Facade;
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
import darin.designPattern.observer.ConcreteObserver;
import darin.designPattern.observer.ConcreteSubject;
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
	
	@Test
	public void testFacade() {
		Facade facade = new Facade();
		facade.MethodA();
		
		facade.MethodB();
	}
	@Test
	public void testBuilder() {
		PersonBuilder personOne = new PersonBuilderOne();
		BuildLeader leader = new BuildLeader(personOne);
		leader.CreatePerson();
		
		PersonBuilder personTwo = new PersonBuilderTwo();
		BuildLeader leaderTwo = new BuildLeader(personTwo);
		leaderTwo.CreatePerson();
	}
	@Test
	public void testObserver() {
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver("1",subject));
		subject.attach(new ConcreteObserver("2",subject));
		subject.attach(new ConcreteObserver("2",subject));
		subject.setSubjectState("ABC");
		subject.nodify();
	}
	@Test
	public void testAbstractFactory() {
		/*DataAccess dataAccess = new DataAccess();*/
		IUser iUser = DataAccess.createUserRef();
		iUser.getUser(0);
		User user = new User();
		iUser.insert(user);
	}
	@Test
	public void testProxy2() {
		UserMrg mgr = new UserMrgImpl();
		InvocationHandler h = new TransactionHandler(mgr);
		UserMrg u;
		try {
			u = (UserMrg)com.darin.proxy.Proxy.newProxyInstance(UserMrg.class,h);
			u.addUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@After
	public void testFinish() {
		System.out.println("Start finish");
	}

}
