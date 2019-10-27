package cs520.module2.L3_3;

public abstract class Animal {
	
	public Animal() {
		System.out.println("Animal Constructor");
	}
	public Animal(int i) {
		System.out.println("Animal Constructor"+i);
	}
	
	public void speak()
	{
		System.out.println("I am an animal, what do I say?");
	}
	
	private void myPrivateMethod(){
		return;
	}
	
}
