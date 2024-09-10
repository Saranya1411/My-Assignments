package Week3.Assignments;

public class changeoddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String test = "changeme";
		    char[] charArray  = test.toCharArray(); //Converting to charArray
		    for  ( int i = charArray .length; i>=0; i--) { //Looping to iterate to odd index
		    	if (i%2!= 0) {
		    		charArray[i]=  Character.toUpperCase(charArray[i]); //changing to upper case
		    	}
		 
		    }
		    System.out.println(charArray);
		
		
	}

}
