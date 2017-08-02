package com.google.chapterone;

public class Concat_Strings {

	public static String joinWords(String [] words) {
		StringBuilder sentence = new StringBuilder();
		for(String s: words) sentence.append(s);
		return sentence.toString();
	}
	
	public static void main(String[] args) {
	
		String s[] = {"Peter", "Ram", "Jack", "Amit"};
		String result = joinWords(s);
		System.out.println("Sentence - "+result);

	}

}
