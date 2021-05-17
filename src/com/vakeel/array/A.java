package com.vakeel.array;

public class A {

	protected void show1() {
		System.out.println("show1");
	}
	
	public void show2() {
		System.out.println("show2");
		show1();
	}
}
