package Week3.Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = new String("stops");
		String text2 = new String("potss");
	    if( text1.length() == text2.length()) {
	    	//changing to charArray
	    	char[] charArray1 = text1.toCharArray();
	        char[] charArray2 = text2.toCharArray(); 
	        //Sorting charArray
	    	Arrays.sort(charArray1);
	    	Arrays.sort(charArray2);
	    	//Comparing inputs
	    	if (Arrays.equals(charArray1, charArray2) ) {
	    		System.out.println("Character Arrays are Equal");
	    	}
	    	else {
	    		System.out.println("The given strings are not an Anagram");
	    	}
	    	
	    }
	    else {
	    	System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	    }

	}

}
