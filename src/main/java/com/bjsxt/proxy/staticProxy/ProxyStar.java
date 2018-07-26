package com.bjsxt.proxy.staticProxy;

public class ProxyStar implements Star {
	
	private Star star;
	
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}

	public void sing() {
		star.sing();
	}

}
