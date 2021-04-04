package com.junit.practice.string;

import java.util.function.Predicate;

public class ImmutableString {
	
	
	//String is immutable
	public void Immutable() {
		String s1="Bala";
		String s2=s1;
		String s3=new String("Bala");
		s1=s3;
		
		if(s1.equals(s2)) {
			System.out.println("resulut when equals::"+s1.equals(s2));
			
		}
		
		if(s1==s2) {
			boolean b=s1==s2;
			System.out.println("result of == method::"+b);
		}
		
		if(s1.equals(s3)) {
			System.out.println("resulut when equals::"+s1.equals(s3));
			
		}
		
		if(s1==s3) {
			boolean b=s1==s3;
			System.out.println("result of == method::"+b);
		}
		
		
	}
	
	/*
	 * String buffer is thread safe and String Builder is not Thread safe
	 * Except this remain all the methods in both builder and buffer are almost same
	 */
	public String StringBufferAndStringBuilder() {
		
		StringBuffer sb=new StringBuffer("Bala");
		sb.append(" Krishna ");
		sb.deleteCharAt(4);
		System.out.println("after deleting space :"+sb);
		sb.replace(0, 4, "Bala");
		System.out.println("after replacing:"+sb);
		StringBuilder sbuilder=new StringBuilder("Mounica");
		sbuilder.append("Balakrishna C");
		System.out.println("final String value is :"+sb.toString().concat(sbuilder.toString()));
		return sb.toString().concat(sbuilder.toString());
	}
public static void main(String[] args) {
	ImmutableString ims=new ImmutableString();
	ims.Immutable();
	ims.StringBufferAndStringBuilder();
}
}
