package cs520.module2.L3_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Database {

	public static List<Animal> retrieveAnimals() {

		String inputFileName = "data.txt";
		FileReader fileReader = null;
		// Create the FileReader object
		try {
			fileReader = new FileReader(inputFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		List<Animal> animals = new LinkedList<Animal>();
		
		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		// Read one line at a time until end of file
		try {
			input = reader.readLine();
			while (input != null)
			{
				switch (input){
				case "Dog":
					animals.add(new Dog());
					break;
				case "Cat":
					animals.add(new Cat());
					break;
				case "Cow":
					animals.add(new Cow());
					break;
				}
				
				input = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Close the input
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return animals;
	}
	
}

