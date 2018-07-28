package com.darin.proxy;

public class Client {

	public static void main(String[] args) throws Exception {
		Movable infce = new Tank();
		InvocationHandler h = new TimerHandler(infce);
		Movable m = (Movable)Proxy.newProxyInstance(Movable.class, h);
		m.move();
	}

}
