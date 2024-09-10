package Week3.Assignments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> Sort = new LinkedList<>(List.of(array));
		Collections.sort(Sort);
	    Collections.reverse(Sort);
	    for (String reverse : Sort) {
			System.out.println(reverse);
		} 
			
	}

}
