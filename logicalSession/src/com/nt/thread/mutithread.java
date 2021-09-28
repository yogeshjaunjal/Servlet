package com.nt.thread;

public class mutithread  extends Thread{

@Override
public void run() {
	System.out.println("thread running: "+Thread.currentThread().getId());
}

	public static void main(String[] args) {
		System.out.println("main start");
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			 mutithread mt=new mutithread();
			    mt.start();
				}
		
   }

}
