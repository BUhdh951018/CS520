package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Legos1 extends JFrame{
	// declare instance variables
	public int startX, startY, legoWidth, legoHeight;
	public int baseLength;
	//  constructor set the default number of each variables
	public Legos1 () {
		// set the window title
		super("He's LEGOs");
		// set the values
		startX = 20;
		startY = 300;
		legoWidth = 50;
		legoHeight = 20;
		baseLength = 10;
	}
	
	// paint method, paint the rectangle in the frame
	public void paint (Graphics g) {
		super.paint(g);
		// declare a variables to count how many line has been paint
		int line = 0;
		while (baseLength > 0) {
			// set the first block's color
			g.setColor(Color.red);
			// paint the 'baselength' line
			for (int i = 0; i < baseLength; i++) {
				// paint the rectangle with the parameter set before and set the round angle
				g.fillRoundRect(startX, startY, legoWidth, legoHeight, 2, 2);
				// move to the next rectangle
				startX += 50;
				// check the position if is even number paint blue
				if (i % 2 == 0) {
					g.setColor(Color.blue);
				} else {
					g.setColor(Color.red);
				}
			}
			// move the Y-axis to the next line
			startY -= 20;
			line++;
			// use the line value to calculate the first rectangle position(X-axis)
			startX = 20 + (legoWidth / 2 * line);
			
			baseLength--;
		}
	}
	
	public static void main(String[] args) {
		// new a lego
		Legos1 lego1 = new Legos1();
		// set the size of the frame
		lego1.setSize(550, 325);
		// set the content of the frame can be seen
		lego1.setVisible(true);
		lego1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
