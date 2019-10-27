package cs520.module2.L3_4;

import java.util.List;

public class Example extends Animal {

	public static void main(String[] args) {
		
		// get the list of animals from the database
		List<Animal> animals = Database.retrieveAnimals();
		
		// have each animal speak
		Animal animal;
		for (int i = 0; i<animals.size(); i++) {
			animal = animals.get(i);
			
			animal.speak();
		}
		
	}

}


