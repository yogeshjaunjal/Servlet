package com.nt.thread;

public class atoz extends Thread {
	@Override
	public void run() {
		System.out.println("Run Start");
		for (char i = 'z'; i >= 'a'; i--) {
			System.out.println(i);
		}
		
	}
public static void main(String[] args) {
	
	System.out.println("Main Start");
	atoz m= new atoz();
	m.start();
	
	
	for (char i = 'a'; i <='z'; i++) {
		System.out.println(i);
		
	}

}
}
