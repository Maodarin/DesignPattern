package darin.designPattern.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.darin.filter.web.FilterChain;
import com.darin.filter.web.HTMLFilter;
import com.darin.filter.web.Request;
import com.darin.filter.web.Response;
import com.darin.filter.web.SesitiveFilter;
import com.darin.iterator.ArrayList;
import com.darin.iterator.Cat;
import com.darin.iterator.Collection;
import com.darin.iterator.Iterator;
import com.darin.iterator.LinkedList;
import com.darin.strategy.DataSorted;
import com.darin.strategy.Dog;

public class Test2 {
	@Before
	public void beforeTest(){
		System.out.println("Start test");
	}

	
	@Test
	public void testFilter2() {
		String msg = "大家好:)，<script>，敏感，被就业，网络授课没感觉，因为看不见大家伙儿";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).addFilter(new SesitiveFilter());
		
		fc.doFilter(request,response,fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}
	@Test
	public void testIterator() {
		Collection c = new ArrayList();
		for(int i=0;i<15;i++) {
			Cat cat = new Cat(i,"cat"+i);
			c.add(cat);
		}
		System.out.println(c.size());
		Iterator iterator = c.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
	@Test
	public void testIterator2() {
		Collection c = new LinkedList();
		for(int i=0;i<15;i++) {
			Cat cat = new Cat(i,"cat"+i);
			c.add(cat);
		}
		System.out.println(c.size());
		Iterator iterator = c.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
	@Test
	public void testStrategy() {
		Dog[] dogs = {new Dog(1,1),new Dog(2,5),new Dog(3,3)};
		DataSorted.sort(dogs);
		DataSorted.p(dogs);
	}
	
	@After
	public void afterTest(){
		System.out.println("end test");
	}
	
	
}
