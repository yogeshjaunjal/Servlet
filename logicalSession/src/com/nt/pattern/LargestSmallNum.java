package com.nt.pattern;

public class LargestSmallNum {

	public static void main(String[] args) {
int a[]=new int[] {10,20,30,40,50,60};
int Largest=a[0];
int small=a[0];
for(int i=1;i<a.length;++i) {
	if(a[i]>Largest) 
		Largest=a[i];
	if(a[i]<small)
		small=a[i];
	
	System.out.println(Largest);
	System.out.println(small);
	
}
	}

}
