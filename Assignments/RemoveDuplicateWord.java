package Week3.Assignments;

import java.util.ArrayList;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "We learn Java basics as part of java sessions in java week1";
	        String[] words = text.split(" "); // Split text into words
	        
	        ArrayList<String> uniqueWords = new ArrayList<>();
	        
	        // Loop through words and add unique words to ArrayList
	        for (String word : words) {
	            // Convert word to lowercase for case-insensitive comparison
	            String lowerCaseWord = word.toLowerCase();
	            if (!uniqueWords.contains(lowerCaseWord)) {
	                uniqueWords.add(lowerCaseWord);
	            }
	        }
	        
	        // Print unique words
	        for (String word : uniqueWords) {
	            System.out.print(word + " ");
	        }
	    }
	}
