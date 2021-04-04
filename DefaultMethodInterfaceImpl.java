package com.junit.practice.collection;

public class DefaultMethodInterfaceImpl implements DefaultMethodsInterface {

	@Override
	public void method1() {
		System.out.println("impl method1");
		
	}
	
	public static void main(String[] args) {
		DefaultMethodsInterface obj=()->{
			System.out.println("lamda");
		};
		obj.method1();
		int a=obj.method2(5, 5);
		System.out.println("a value is ::"+a);
	}

}
