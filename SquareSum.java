package a5;

public class SquareSum {
	public static void main(String[] args) {
		int b = 0, c = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 13 == 0)
				b += a;
			c += a * a;
		}
		System.out.println("The sum of all numbers divisible by 13 is " + b);
		System.out.println("The sum of all squares is " + c);
	}
}
