package com.nt.pattern;

import java.io.Serializable;

public class bank  implements Serializable{
	private  int accNum;
	private float balance;
	
	 public int getaccNum() {
		    return accNum;
		  }

	   public void setaccNum(int accNum) {
		    this.accNum = accNum;
		  }
	   
	
	 public float getbalance() {
		    return balance;
		  }

	   public void setbalance(float balance) {
		    this.balance = balance;
		  }


}
