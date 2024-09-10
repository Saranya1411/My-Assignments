package Week3.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array =  {1, 2, 3, 4, 10, 6, 8};
		List<Integer> list = new LinkedList<>(List.of(array));
		Collections.sort(list);
		System.out.println("Missing Elements are");
		for (int i=0; i< list.size()-1; i++) {
				
			int current = list.get(i);
			int next = list.get(i+1);
			
			if (next != current) {
				 for (int j = current + 1; j < next; j++) {
	                    System.out.println(j);
			}
		}
		}
	}
}
		



