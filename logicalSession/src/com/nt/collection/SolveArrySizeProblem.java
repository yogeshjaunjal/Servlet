package com.nt.collection;


/*
 * array have to problem
 * 
 *=>it allow to store only same element in Array----->solved by using java.lang.Object[]
 *=>it a Fix Size -----> solve by follwing
 */
public class SolveArrySizeProblem {

	public static void main(String[] args) {
		//create Array object
		Object[] obj=new Object[4];
		//Assing array object
		
		obj[0]="50";
		obj[1]="60";
		obj[2]="70";
		obj[3]="80";
		
// we cant add new element in same obj ref veriable so create new arry
		Object[] tempobj=new Object[10];
		
		//coping old array size in new array size
		int objTempSize=obj.length;
		int i=0;
		//coping old element in new array 
		for (; i <objTempSize; i++) {
			tempobj[i]=obj[i];
			
			
		}
		//Strong new element in arry
		tempobj[i]="90";
		
		//Assing new array object into old array obj
		obj=tempobj;
		
for ( i = 0; i <obj.length; i++) {
	System.out.println(obj[i]);
}
	
	
	}

}
