package com.nt.thread;

public class check extends Thread {
@Override
public void run() {
	System.out.println("run Start:");
	for (int i = 1; i <=10; i++) {
		System.out.println(i);
		
	}
	
}
	public static void main(String[] args) {
		check ch=new check();
		ch.start();
		System.out.println("current state is:"+ch.getState());
		System.out.println("current isalive thread "+ch.isAlive());
		check ch1=new check();
		ch1.start();
		System.out.println("current state is:"+ch.getState());
		System.out.println("current isalive thread "+ch.isAlive());
		
	}

}
