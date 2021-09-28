package com.nt.collection;

import java.util.TreeSet;

public class Sortsetmethods {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("x");
		ts.add("y");
		
		//first
		ts.first();
		ts.last();
		
		ts.headSet("x");
		ts.tailSet("b");
		ts.subSet("b","x");
		

	}

}
