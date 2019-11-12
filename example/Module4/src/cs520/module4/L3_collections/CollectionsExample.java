package cs520.module4.L3_collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsExample {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("1", "Fred", 5000));
	
		System.out.println("Number of objects = " + employees.size());
		for( Employee e : employees){
			System.out.println("item: " + e);
		}
		System.out.println();
		
	}

}
