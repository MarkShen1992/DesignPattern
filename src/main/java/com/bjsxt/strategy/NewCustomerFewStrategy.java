package com.bjsxt.strategy;

public class NewCustomerFewStrategy implements Strategy {

	public double getPrice(double standardPrice) {
		System.out.println("不打折，原价");
		return standardPrice;
	}

}
