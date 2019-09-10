package cs520.hw1;

public class Triples {
	public static void main(String[] args) {
		int count = 1;
		System.out.println("Count\t x\t y\t z");
		for (int x = 1; x < 101; x++) {
			for (int y = x + 1; y < 101; y++) {
				int temp = x*x + y*y;
				int z = (int) Math.sqrt(temp);
				if (z*z == temp) {
					System.out.println(count + ")\t" + x + "\t" + y + "\t" + z);
					count++;
				}
			}
		}
	}
}
