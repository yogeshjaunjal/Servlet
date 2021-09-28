package com.nt.pattern;

public class BubbleSort {
	static void bubblesort(int[] a) {
		
		int n=a.length;
		int temp=0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (a[j-1]>a[j]) {
					
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {35,8,52,9,18,62,13};
		bubblesort(a);
		
		//after swap
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		

	}

}
