package com.nt.thread;


public class Myclass extends Thread {
	@Override
	public void run() {
		System.out.println("Run Start");
		for (int i = 15; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
public static void main(String[] args) {
	
	System.out.println("Main Start");
	
	for (int i = 1; i <=15; i++) {
		System.out.println(i);
		
	}
	Myclass m= new Myclass();
	m.start();
	
}
}
