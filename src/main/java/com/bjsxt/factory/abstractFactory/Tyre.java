package com.bjsxt.factory.abstractFactory;

public interface Tyre {
	void revolve();
}

class LuxuryTyre implements Tyre {

	public void revolve() {
		System.out.println("旋转不磨损！");
	}
}

class LowTyre implements Tyre {

	public void revolve() {
		System.out.println("旋转磨损快！");
	}
}