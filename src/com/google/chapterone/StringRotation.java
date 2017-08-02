package com.google.chapterone;

//ctci - Page 91 Q 1.9 String Rotation

public class StringRotation {

	public static boolean isRotation(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;
		else {
			String s3 = s1 + s1;
			return isSubstring(s3, s2);
			
		}

	}
	
	public static boolean isSubstring(String s1, String s2){
		return s1.contains(s2);
	}

	public static void main(String[] args) {

		boolean b = isRotation("waterbottle", "lewaterbott");
		System.out.println(b);
		
	}

}


/*public boolean isSubString (String str1, String str2) {
	
	if(str1.length() != str2.length())
		return false;
	
	String str3 = str1+ str1;
	if (str3.contains(str2))
		return true;
	else return false;
}
*/