package com.nt.pattern;
import java.util.Scanner;
/*  
 * write a school student program to show the comman resusablity thing that will
 * get 1 time memory  allocation  and execute for every student content and also print each 
 * student detalis with diff values and also show that if some  student want to change 
 * theair detalils is it going to effect with other student or not?? 
 */
public class Student {
	//static variable 

	static String stream="Computer Science";
	static String schoolName="A.B.C School";
	static String schoolLocation="Hyd";
	//Non static vaiable
	String studentName;
	 int studentRollNo;
	 int studentIDNo;
	 
   void  m1(String a,int b,int c) {
		studentName=a;
		 studentRollNo=b;
		 studentIDNo=c;
	 System.out.println("==============================================");
		  System.out.println("Student Name is::  "+studentName);
		  System.out.println("Student RollNo is:: "+studentRollNo);
		  System.out.println("Student IDNo is::     "+studentIDNo);
		  System.out.println("Student Strem is::   "+stream);
		  System.out.println("Student School Name is::"+schoolName);
		  System.out.println("Student School  Location is::"+schoolLocation);
	System.out.println("==============================================");
 }
	 
	public static void main(String[] args) {
		//taking input from end user by using Scanner class
		  Scanner scn=new Scanner(System.in);

 	  System.out.println("Enter the Student Name::");
 	//using scn obj we call predefined method next() is it read string value from console & assign into Name variable
 	  String Name=scn.next();           
 	  System.out.println("Enter the Student RollNo::");
 	  int RollNo=scn.nextInt();
 	 System.out.println("Enter the Student IDNo::");
	  int IDNo=scn.nextInt();
	  
	  Student s1=new Student();
	  s1.m1(Name, RollNo, IDNo);
	 }

}
