package cs520.hw6;

public class SharedResults {
	// create a instance private variable
	private int result;
	
	// two method are handled the synchronization issue
	// method void (add a integer to the variable created, display the name of the thread and the result value)
	public synchronized void addToResult(int number) {
		result += number;
		System.out.println(Thread.currentThread().getName() + " is adding " + number + ", Cumulative Result is " + getResult());
	}
	
	// method int (return the value)
	public synchronized int getResult() {
		return result;
	}

}
