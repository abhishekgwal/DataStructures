package com.google.chapterone;

//Question 1.4 ctci Page 91 - Palendrome Permutation

import java.util.HashMap;

public class PalendromePermutation {

	public static void charCount(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int count = 0;
		char[] c = str.toCharArray();
		for (char ch : c) {
			if (hm.containsKey(ch)) {

				hm.put(ch, hm.get(ch) + 1);
			} else
				hm.put(ch, 1);
		}
		System.out.println("Charater Count = " + hm);

		for (char key : hm.keySet()) {
			System.out.format("%c ", +key);
			System.out.print(" = ");
			System.out.print(hm.get(key));

			if (hm.get(key) % 2 == 1) {

				count = count + 1;
			}

			System.out.println();
		}
		if (count >= 2)
			System.out.println("String is NOT a Palendromic Permutation");
		else
			System.out.println("String is a Palendromic Permutation");

	}

	public static void main(String[] args) {
		charCount("tactcoapapa");
	}

}
