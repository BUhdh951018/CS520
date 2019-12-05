package cs520.hw6;

public class Test {

	public static void main(String[] args) {
		// create SharedResults object and assign it to a variable
		SharedResults results = new SharedResults();
		
		// create five LongTask objects and passing the 'results, start, end'
		Thread longTask1 = new LongTask(results, 1, 100);
		Thread longTask2 = new LongTask(results, 101, 200);
		Thread longTask3 = new LongTask(results, 201, 300);
		Thread longTask4 = new LongTask(results, 301, 400);
		Thread longTask5 = new LongTask(results, 401, 500);
		
		// start thread
		longTask1.start();
		longTask2.start();
		longTask3.start();
		longTask4.start();
		longTask5.start();
		
		try {
			// join the thread
			longTask1.join();
			longTask2.join();
			longTask3.join();
			longTask4.join();
			longTask5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// print the result
		System.out.println("Result: " + results.getResult());
	}
}
