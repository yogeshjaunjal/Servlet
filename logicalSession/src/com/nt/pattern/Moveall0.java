package com.nt.pattern;

import java.util.Arrays;

public class Moveall0 {

	public static void main(String[] args) {
	int a[]= {0,1,0,0,4,0,5,0};
	Arrays.sort(a);
	
	
	for (int i = a.length-1; i >0; i--) {
		for (int i1 =a.length/2; i1 >0; i1--) {
			System.out.println(a[i1]);
		}

	}
	
	}

}
