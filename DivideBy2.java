package a5;

public class DivideBy2 {
	public static void main(String[] args) {
		int num1 = 40;
		int a = 0;
		while (num1 >= 2) {
			num1 = num1 / 2;
			a++;
		}
		System.out.println(a);
	}
}