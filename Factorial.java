package a5;

public class Factorial {
	public static void main(String[] args) {
		long a = 1, b = 1;
		while (a <= 17) {
			b *= a;
			a++;
		}
		System.out.print("The factorial of 7 is " + b);
	}
}