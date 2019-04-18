package com.gaurav.javafromnotes.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("C");
		hs.add("C++");
		hs.add("Java");
		hs.add("Oracle");
		hs.add("PHP");
		hs.add("AJAX");
		
		System.out.print("HashSet items : " + hs); //unpredictable, does not maintain any order

	}

}
