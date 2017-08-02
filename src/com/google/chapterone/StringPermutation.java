package com.google.chapterone;

//Page 90 from ctci. Q1.2 Compare two string Permutation

import java.util.Arrays;

public class StringPermutation {
	
	public static boolean compare(String a, String b){
		
		if(a.length()!= b.length())
			return false;		
		
		char c1[] = a.toCharArray();
		char c2[] = b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
			return true;
		else return false;
	}

	public static void main(String[] args) {
		
		String str1 = "tomato", str2 = "oatomt";
		
		boolean b = compare(str1, str2);
		System.out.println(b);

	}

}
