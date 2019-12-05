package cs520.hw6;

import java.util.Random;

public class LongTask extends Thread{
	
	// instance private variables 
	// SharedResults type
	private SharedResults sharedData;
	// int type
	private int start, end;
	
	// constructor (take above three arguments and create a name for the thread)
	public LongTask(SharedResults sharedData, int start, int end) {
		super("Thread_" + start + "_" + end);
		this.sharedData = sharedData;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		// variable get the total of the numbers
		int sum = 0;
		
		// get a random for sleep method
		Random random = new Random();
		
		// from start to end using the loop to add integer numbers
		for (int i = start; i <= end; i++) {
			sum += i;
			
			// set the sleep time as long variable
			long sleepTime = random.nextInt(10);
			
			try {
				// sleep for a time
				sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// invoke the method to display the accumulated sum
		sharedData.addToResult(sum);
	}
}
