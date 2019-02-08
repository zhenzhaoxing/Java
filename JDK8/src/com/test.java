package com;

public class test<T> {
	
	
	public test(){
		System.out.println("test");
	}
	
	
	
	static{
		System.out.println("sssss");
	}
	
	
	public static void main(String[] args) {

		test<String> t = new test();
		

	
	}
}