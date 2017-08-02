package com.google.chapterone;

public class Urlify {

	public void replace(String s1, int length) {
		char[] chars = s1.toCharArray();
		int spaceCount = 0;
		for (int i = 0; i < length; i++) {
			if (chars[i] == ' ') {
				spaceCount++;
			}
		}
		int newLength = length + 2 * spaceCount;
		char [] charsNew = new char [newLength];
		for (int i = length - 1; i >= 0; i--) {
			if (chars[i] == ' ') {
				charsNew[newLength - 1] = '0';
				charsNew[newLength - 2] = '2';
				charsNew[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
//				System.out.println(chars[i]);
				charsNew[newLength - 1] = chars[i];
				newLength = newLength - 1;
			}
		}
		System.out.println("Output String : " + String.valueOf(charsNew));
	}

	public static void main(String args[]) {
		String s1 = "Mr John Smith    ";
		int trueLength = s1.length();
		System.out.println("Input String : " + s1);
		Urlify r = new Urlify();
		r.replace(s1, trueLength);
	}


}



/* Solution from book
  public void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;

        for(i = 0; i < trueLength; i++) {
            if (str[i] == ' ') 
                spaceCount++;
        }
	

        index = trueLength + spaceCount * 2;
        if(trueLength <str.length)
        	str[trueLength] = '\0';
        for(i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            }
            else {
                str[index - 1] = str[i];
                index-- ;
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Urlify obj = new Urlify();
        char[] ch = {'M', 'r',' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ',' ', ' '};
        int trueLength = 13;
        obj.replaceSpaces(ch, trueLength);  
    }
 * 
 * */


/*		
 		String s1 = "Mr John Smith    ";
		System.out.println(s1.trim().replaceAll(" ", "%20"));
 */
