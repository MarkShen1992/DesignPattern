package com.bjsxt.factory.factorymethod;

public class BenzFactory implements CarFactory {

	public Car createCar() {
		return new Benz();
	}
}
