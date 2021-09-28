package com.nt.pattern;

public class selctionsortString{
static void selectionsortString(String a[]) {
	for (int i = 0; i < a.length; i++) {
		int min=i;
		for (int j = i+1; j < a.length; j++) {
			if (a[j].compareTo(a[min])<0) {
				min=j;
					}
			}
 String temp=a[min];
 a[min]=a[i];
 a[i]=temp;
	}
	
}
	public static void main(String[] args) {
String a[]= {"yogesh","amit","suresh","mahi"};
selectionsortString(a);

for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
	
}
	}

}
