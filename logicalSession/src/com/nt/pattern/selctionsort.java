package com.nt.pattern;

public class selctionsort {
static void selectionsort(int a[]) {
	for (int i = 0; i < a.length; i++) {
		int min=i;
		for (int j = i+1; j < a.length; j++) {
			if (a[j]<a[min]) {
				min=j;
					}
			}
 int temp=a[min];
 a[min]=a[i];
 a[i]=temp;
	}
	
}
	public static void main(String[] args) {
int a[]= {38,52,9,18,62,13};
selectionsort(a);

for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
	
}
	}

}
