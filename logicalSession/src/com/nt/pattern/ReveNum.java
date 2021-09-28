package com.nt.pattern;

public class ReveNum {
	static int rev=0;

	static void reverse(int n) {	
      if(n<=0) 
    	  return;
      
		int rem=(n%10);//reminder
        rev=(rev*10)+rem;
		reverse(n/10);
	}
				
	public static void main(String[] args) {
	int n=123;
	reverse(n);
	System.out.println("revserse num is"+rev);
	}
	


}
