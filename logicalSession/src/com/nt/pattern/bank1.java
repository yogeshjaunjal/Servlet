package com.nt.pattern;

public class bank1 {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance<=0) {
			System.out.println("dont passs negative value");
			
		}else {
		this.balance = this.balance+balance;
		}
	}
	

}
