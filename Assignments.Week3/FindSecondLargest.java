package Week3.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] array = {3, 2, 11, 4, 6, 7};
		Arrays.sort(array);
		
		  List<Integer> list = new ArrayList<>(List.of(array));
	      Collections.sort(list);
	      System.out.println("Second Largest Number " +  list.get(list.size()-2)); 
	

	}

}
