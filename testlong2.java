package a7;

import java.util.Scanner;

public class testlong2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String i = sc.nextLine();
		int b = i.length() - 1;
		while (b > 0) {
			while (!i.equals("exit")) {
				char c = i.charAt(b);
				if (c >= '0' && c <= '7') {
					b--;
					if (b == -1) {
						break;
					}
				} else {
					System.out.println("Please input a valid Octal Number:");
					i = sc.nextLine();
					continue;
				}
				int sum = 0;
				for (int d = 0; d < i.length(); d++) {
					int f = Integer.parseInt(i);
					int e = f / (int) Math.pow(10, d);
					int a = e % 10;
					sum = sum + a * (int) Math.pow(8, d);
					e = e / 10;
					if (d == i.length() - 1) {
						String number2 = new String("");
						String digits = new String("0123456789ABCDEF");
						int position2 = 0;
						while (sum > 0) {
							position2 = sum % 16;
							number2 = digits.charAt(position2) + number2;
							sum = sum / 16;
						}
						System.out.println("Output: \n" + number2);
					}
				}
				i = sc.nextLine();
			}
		}
	}
}