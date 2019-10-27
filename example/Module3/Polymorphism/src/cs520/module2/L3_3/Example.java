package cs520.module2.L3_3;

public class Example extends Animal {

	public static void main(String[] args) {
		
		Animal animal;
		
		animal = new Cat(); 
		animal.speak();
		
		animal = new Dog();
		animal.speak();
		
		animal = new Cow();
		animal.speak();
	
		//animal = new Animal();
	}

}
