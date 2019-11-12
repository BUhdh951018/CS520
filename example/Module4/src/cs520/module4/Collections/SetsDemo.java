package cs520.module4.Collections;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;;

public class SetsDemo {

	public static void main(String[] args) {
		
		// Create an empty list of String objects
		//HashSet<String> colors = new HashSet<String>();
		
		//LinkedHashSet<String> colors = new LinkedHashSet<String>();
		TreeSet<String> colors = new TreeSet<String>();
		System.out.printf("Initial size = %d\n", colors.size());
					
		// Add elements to the set (in this case String objects)
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Blue");
		
		System.out.println("Colors: " + colors);
		System.out.printf("Size = %d\n", colors.size());

		// now add blue again
		colors.add("Blue");
		System.out.println("Colors: " + colors);
		System.out.printf("Size = %d\n", colors.size());
		
	}

}
