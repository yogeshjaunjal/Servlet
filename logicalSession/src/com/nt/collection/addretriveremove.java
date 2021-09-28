package com.nt.collection;

import java.util.ArrayList;

public class addretriveremove {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
     	al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Pink");
		al.add("Orange");

		//Display the Array List
		System.out.println("\n Contents of ArrayListn After Adding:"+al);

		al.remove(4);
		System.out.println("\n Contents of ArrayListn After Removing:"+al );

		//remove "pink element from ArrayList"
		al.remove("Pink");
		System.out.println("\n Contents of ArrayListn After Removing:"+al );
         System.out.println("size :"+al.size());

		//retriving 1st index Element from ArrayList
		String alElement=(String) al.get(2);
		System.out.println("alElement:"+alElement);
		

		}
	
		
	}

