package com.nt.pattern;

public class Example1 {
	int a=10;
	int b=20;
	void m1() {
		System.out.println(a);
		System.out.println(b);
		m2();
		
	}
	void m2() {
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Example1 e1=new Example1();
            e1.m1();
            
	}

}
