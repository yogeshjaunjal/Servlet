package com.nt.pattern;

public class AssignArray {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7,8,9,};
int b[]=new int[a.length];
b=a;
//b[0]++;
for (int i = 0; i < b.length; i++) {
	
	System.out.println(b[i]);

}
	}

}
