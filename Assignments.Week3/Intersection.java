package Week3.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Integer[] array1 =  {3, 2, 11, 4, 6, 7};
		Integer[] array2 = {1, 2, 8, 4, 9, 7};
		
//		List<Integer> list1 = new LinkedList<>(Arrays.asList(array1));
//		List<Integer> list2 = new LinkedList<>(Arrays.asList(array2));
//		
//		list1.add(10);
//		list2.add(10);
//		
//		for (Integer compare : list1) {
//			if (list2.contains(compare)) {
//				System.out.println(compare);
		
		
		List<Integer> list1 = new LinkedList<>(Arrays.asList(array1));
    	List<Integer> list2 = new LinkedList<>(Arrays.asList(array2));
    	System.out.println("Intersection Values");
          for (Integer compare1 : list1) {
		    for (Integer compare2 : list2) {
			    if(compare1 == compare2) {
				System.out.println(compare1);
		}
	}
    	
		
		}
			

	}

}
