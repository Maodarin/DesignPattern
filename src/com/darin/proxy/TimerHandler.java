package com.darin.proxy;

import java.lang.reflect.Method;

public class TimerHandler implements InvocationHandler{
	private Object target;
	public TimerHandler(Object target) {
		super();
		this.target = target;
	}
	@Override
	public void invoke(Object o, Method m) {
		long start = System.currentTimeMillis();
		System.out.println("starttimer:"+start);
		System.out.println(o.getClass().getName());
		try {
			m.invoke(target);
		}catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time="+(end-start));
		
	}
}
