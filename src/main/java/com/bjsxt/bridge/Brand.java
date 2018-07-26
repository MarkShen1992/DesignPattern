package com.bjsxt.bridge;

/**
 * 品牌
 * @author Administrator
 *
 */
public interface Brand {
	void sale();
}

class Lenovo implements Brand {
	public void sale() {
		System.out.println("销售联想电脑");
	}
}

class Dell implements Brand {
	public void sale() {
		System.out.println("销售Dell电脑");
	}
}

class Shenzhou implements Brand {
	public void sale() {
		System.out.println("销售神舟电脑");
	}
}