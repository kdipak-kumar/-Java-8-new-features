package com.nit.purpose;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String[] s = { "bat", "map", "map", "mat", "map", "mat", "Dipak", "Dipak", "Kiru" };


		int count = 0; 
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					count = count + 1; 
					} 
				} 
			   if (count >=	2) {
					System.out.println("Duplicate values is :" + s[i] + " and duplicate no "
						+ count); count = 0; 
					}

		}


		/*
		 * for (int i = 0; i < s.length; i++) { for (int j = i+1; j < s.length; j++) {
		 * if (s[i].equals(s[j])) { System.out.println(s[i]); } } }
		 */

		/*
		 * Set<String> e = new HashSet<String>(); for (String dt : s) { if (e.add(dt) ==
		 * false) { System.out.println(e); } } System.out.println(e);
		 */
		
	}
}
