package a5;

public class DivideBy7 {
	public static void main(String[] args) {
		for (int a = 10; a <= 70; a++) {
			if (a % 7 == 0) {
				System.out.println(a);
			}
		}
	}
}