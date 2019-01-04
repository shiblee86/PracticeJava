package com.allTheLoops;

import java.util.ArrayList;
import java.util.List;

public class CollectionIteration {
	
	public static void main(String[] args) {
		List<String>names = new ArrayList<String>();
		names.add("Syed");
		names.add("Abdullah");
		names.add("ABC");
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for(String n : names) {
			System.out.println(n);
		}
		
		names.forEach(System.out::println);		
	}
	

}
