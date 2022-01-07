package a7;

import java.util.Scanner;

public class textlong3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String inputStr;
		String digits = new String("0123456789");
		System.out.println("Input:");
		boolean isdigit;
		while (!(inputStr = in.nextLine()).equals("exit")) {
			isdigit = true;
			for (int i = 0; i < inputStr.length(); i++) {
				if (digits.indexOf(inputStr.charAt(i)) == -1) {
					isdigit = false;
					break;
				}
			}
			inputStr.equals("false");
			if (isdigit && Long.parseLong(inputStr) >= Byte.MIN_VALUE && Long.parseLong(inputStr) <= Byte.MAX_VALUE) {
				System.out.println(inputStr + " can be converted into a type byte!");
			} else {
				System.out.println(inputStr + " cannot be converted into a type byte!");
				if (isdigit && Long.parseLong(inputStr) >= Integer.MIN_VALUE
						&& Long.parseLong(inputStr) <= Integer.MAX_VALUE) {
					System.out.println(inputStr + " can be converted into a type int!");
				} else {
					System.out.println(inputStr + " cannot be converted into a type int!");
				}
				if (isdigit && Long.parseLong(inputStr) >= Short.MIN_VALUE
						&& Long.parseLong(inputStr) <= Short.MAX_VALUE) {
					System.out.println(inputStr + " can be converted into a type short!");
				} else {
					System.out.println(inputStr + " cannot be corverted into a type short!");
				}
				if (isdigit && Long.parseLong(inputStr) >= Long.MIN_VALUE
						&& Long.parseLong(inputStr) <= Long.MAX_VALUE) {
					System.out.println(inputStr + " can be converted into a type long!");
				} else {
					System.out.println(inputStr + " cannot be converted into a type long!");
				}
			}
		}
	}
}
