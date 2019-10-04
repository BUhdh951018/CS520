package cs520.hw1;

public class Triples {
	public static void main(String[] args) {
		int count = 1;
		System.out.printf("%5s %3s %4s %4s\n", "Count", "x", "y", "z");
		for (int x = 1; x < 101; x++) {
			for (int y = x + 1; y < 101; y++) {
				int temp = x*x + y*y;
				int z = (int) Math.sqrt(temp);
				if (z*z == temp) {
					System.out.printf("%3d) %4d %4d %4d\n",count, x, y, z);
					count++;
				}
			}
		}
	}
}
