package com.bjsxt.proxy.staticProxy;

public class RealStar implements Star {

	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}

	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}

	public void confer() {
		System.out.println("RealStar.confer()");
	}

	public void signContract() {
		System.out.println("RealStar.signContract()");
	}

	public void sing() {
		System.out.println("RealStar(周杰伦本人).sing()");
	}

}
