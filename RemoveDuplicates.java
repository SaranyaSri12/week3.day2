package week1.day2.assignments.mandatory;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

import org.apache.commons.collections4.list.TreeList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	
	String text = "We learn java basics as part of java sessions in java week1";
	int count = 0;
	String[] textArray = text.split(" ");

	String[] split = text.split(" ");
	Set<String> set1 = new LinkedHashSet<String>();
	for (String string : textArray) {
		if (!set1.contains(string)) {
			set1.add(string);
		} else {
			count++;
			if (count > 1) {					
				String replacedString = text.replace(string, "");
				System.out.println(replacedString);

			}
		}
	}
	
	}
}