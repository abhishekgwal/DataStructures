package com.google.chapterone;

import java.util.HashSet;

public class UniqueCharacter {

	public static boolean uniqueCharacter(String s){
		boolean b = false ;
		HashSet<Character> hs = new HashSet<>();
		for(int i = 0; i <s.length(); i++) {
		b = hs.add(s.charAt(i));
		System.out.print(s.charAt(i) + "  "+ b);
		System.out.println();
		if(b == false)
				return b;
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		String str = "amazon";
		boolean unique = uniqueCharacter(str);
		System.out.println(unique);
		

	}

}

//Without using additional data structure

/*
  public boolean hasUnique(String str) {
	
	for(int i = 0; i <str.length(); i++) {
		for (int j = i + 1; j < str.length(); j++)
			if (str.charAt(i) == str.charAt(j))
				return false;
	}
	return true;
}
 * */
