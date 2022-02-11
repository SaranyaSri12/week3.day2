package week1.day2.assignments.mandatory;

import java.util.ArrayList;
import java.util.List;

public class MissingElementInAnArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,7,6,8};
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(7);
	list.add(6);
	list.add(8);
	for (int i = 0; i < arr.length; i++) {
		
			
		
		if(!list.equals(arr[i]))
		{
			System.out.println(list);
		}
		
	}
	
	
}
}
