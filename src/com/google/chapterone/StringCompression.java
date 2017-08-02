package com.google.chapterone;

import java.util.HashMap;
import java.util.Map;

//Page 201 - ctci q 1.6

public class StringCompression {
	
	public static void compressString(String str) {
		int count = 1;
		StringBuilder sb = new StringBuilder();
		char currentChar = str.charAt(0);
		sb.append(currentChar);
		for (int i = 1; i < str.length(); i++) {
			char nextChar = str.charAt(i);
			if (currentChar == nextChar) {
				count++;
			} else {
				sb.append(count);
				currentChar = nextChar;
				count = 1;
				sb.append(currentChar);
			}
			
		}
		sb.append(count);
		System.out.println(sb);
		
	}
	

	public static void main(String[] args) {
		
		compressString("aabcccccaaa");
		compressString("aaaahhsdasssee");
		
	}

}



// Method 2 - But not recommended

/* 	public static void main(String[] args) {

		Map<Character, Integer> hm = new HashMap<>();
		hm.put('a', 2);
		hm.put('b', 3);
		hm.put('c', 5);

		
		for(Object obj:hm.keySet()) {
			   System.out.print(obj);
			   System.out.print(hm.get(obj));
			 }

	}
 * 
 * */
