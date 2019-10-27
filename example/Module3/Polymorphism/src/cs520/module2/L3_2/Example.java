package cs520.module2.L3_2;

public class Example extends Animal {

	public static void main(String[] args) {
		
		Animal animal = new Cat();
		animal.speak();

		animal = new Dog();
		animal.speak();
		
		animal = new Cow();
		animal.speak();
		
		animal = new Animal();
		animal.speak();
		
//		Cat cat = new Cat();
//		cat.speak();
		
//		Dog dog = new Dog();
//		dog.speak();
		
//		Cow cow = new Cow();
//		cow.speak();
		
	}

}
