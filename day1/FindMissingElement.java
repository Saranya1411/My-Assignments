package Week1.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int element[]=  {1,4,3,2,8, 6, 7};
		Arrays.sort(element);
	
		for (int i=0; i<=element.length-1; i++) {
				
				if(element[i+1] - element[i] !=1) {
					System.out.println(element[i]+1);
					break;	
				}
			}
			
		}
		

	}


