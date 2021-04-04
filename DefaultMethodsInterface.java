package com.junit.practice.collection;

@FunctionalInterface
public interface DefaultMethodsInterface {

	void method1();
	default int method2(int a,int b) {
		System.out.println("default method in interface");
		return a*b;
	}
}
