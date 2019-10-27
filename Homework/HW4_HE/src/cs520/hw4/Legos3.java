package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class Legos3 extends JFrame{

	public int startX, startY, legoWidth, legoHeight;
	public int baseLength;
	
	public Legos3() {
		super("He's LEGOs");
		startX = 20;
		startY = 300;
		legoWidth = 50;
		legoHeight = 20;
		baseLength = 10;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Color[] colors;
		colors = new Color[9];
		colors[0] = Color.red;
		colors[1] = Color.blue;
		colors[2] = Color.yellow;
		colors[3] = Color.green;
		colors[4] = Color.pink;
		colors[5] = Color.black;
		colors[6] = Color.magenta;
		colors[7] = Color.orange;
		colors[8] = Color.cyan;
		
		int line = 0;
		int last = 0;
		while (baseLength > 0) {
			for (int i = 0; i < baseLength; i++) {
				g.fillRoundRect(startX, startY, legoWidth, legoHeight, 2, 2);
				startX += 50;
				Random random = new Random();
				int temp = random.nextInt(colors.length);
				// check whether the color has been choose in the last one rectangle
				while (last == temp) {
					temp = random.nextInt(colors.length);
				}
				g.setColor(colors[temp]);
				// save the last one color
				last = temp;
			}
			
			startY -= 20;
			line++;
			startX = 20 + (legoWidth / 2 * line);
			
			baseLength--;
		}
	}
	
	public static void main(String[] args) {
		Legos3 legos3 = new Legos3();
		legos3.setSize(550, 325);
		legos3.setVisible(true);
		legos3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
