package cs520.hw1;

import javax.swing.JOptionPane;

public class Banking {
	public static void main(String[] agrs) {
		// prompt user a input
		String input = JOptionPane.showInputDialog(null, "Enter the amount: \n","Input", JOptionPane.QUESTION_MESSAGE);
		// convert it to integer
		int amount = Integer.parseInt(input);
		// print the amount
		System.out.println("Requested Amount = " + amount);
		
		// declare the denominations and remain amount
		int hundreds = 0, fifties = 0, twenties = 0, tens = 0, fives = 0, twos = 0,ones = 0;
		int remainingAmount = 0;
		
		// compute each amount and output
		// hundreds
		hundreds = amount / 100;
		remainingAmount = amount % 100;
		System.out.println("Hundreds = " + hundreds + ", Remaining Amount = " + remainingAmount);
		
		// fifties
		fifties = remainingAmount / 50;
		remainingAmount = remainingAmount % 50;
		System.out.println("Fifties = " + fifties + ", Remaining Amount = " + remainingAmount);
		
		// twenties
		twenties = remainingAmount / 20;
		remainingAmount = remainingAmount % 20;
		System.out.println("Twenties = " + twenties + ", Remaining Amount = " + remainingAmount);
		
		// tens
		tens = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		System.out.println("Tens = " + tens + ", Remaining Amount = " + remainingAmount);
		
		// fives
		fives = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		System.out.println("Fives = " + fives + ", Remaining Amount = " + remainingAmount);
		
		// twos
		twos = remainingAmount / 2;
		remainingAmount = remainingAmount % 2;
		System.out.println("Twos = " + twos + ", Remaining Amount = " + remainingAmount);
		
		// ones
		ones = remainingAmount / 1;
		remainingAmount = remainingAmount % 1;
		System.out.println("Ones = " + ones);
		
		// message dialog output
		JOptionPane.showMessageDialog(null, "Requested Amount (" + amount + ")\n" 
		+ "Hundreds (" + hundreds + ")\n" 
		+ "Fifties (" + fifties + ")\n" 
		+ "Twenties (" + twenties + ")\n" 
		+ "Tens (" + tens + ")\n" 
		+ "Two (" + twos + ")\n"
		+ "Ones (" + ones + ")\n", "Message", JOptionPane.INFORMATION_MESSAGE);
	}
}
