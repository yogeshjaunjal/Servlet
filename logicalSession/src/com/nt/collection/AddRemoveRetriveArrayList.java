package com.nt.collection;

import java.util.ArrayList;

public class AddRemoveRetriveArrayList {
public static void main(String[] args) {
	//create array list obj
	ArrayList al=new ArrayList();
System.out.println("Intial Size of Array List:"+al.size());

//Add element in Array List
al.add("Red");
al.add("Green");
al.add("Blue");
al.add("Pink");
al.add("Orange");

System.out.println("\n Size of Array after Additions:"+al.size());

//Display the Array List
System.out.println("\n Contents of ArrayListn After Adding:"+al);

//Remove 4th Index Element From Arraylist 
al.remove(4);
System.out.println("\n Contents of ArrayListn After Removing:"+al );

//remove "pink element from ArrayList"
al.remove("Pink");
System.out.println("\n Contents of ArrayListn After Removing:"+al );
System.out.println("\n Size of Array after Remove:"+al.size());

//retriving 1st index Element from ArrayList
String alElement=(String) al.get(1);
System.out.println("alElement:"+alElement);

//inserting Element in 2th index 
al.add(2, alElement+", rose");
System.out.println(al);




}
}
