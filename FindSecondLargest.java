package week1.day2.assignments.mandatory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import week3.day1.ListClass;

public class FindSecondLargest {
public static void main(String[] args) {
	// Here is the input
			int[] data = {3,2,11,4,6,7};
			List<Integer> list = new ArrayList<Integer>();
		    list.add(3);
		    list.add(2);
		    list.add(11);
		    list.add(4);
		    list.add(6);
		    list.add(7);
		    
		   Collections.sort(list);
		   System.out.println("The Second Largest Number is "+" "+list.get(1));
		
 		    
			
		
		
}
}
