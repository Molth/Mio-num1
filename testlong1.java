package a7;

import java.util.Scanner;

public class testlong1 {
	public static void main(String[] args) {
		System.out.println("Please enter the words here");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		while (!num.equals("exit")) {
//				
			{
				long number = Long.parseLong(num);
//
				if (Integer.MIN_VALUE < number & number < Integer.MAX_VALUE) {
					System.out.println(num + " can be converted into a type int!");
				} else {
					System.out.println(num + " cannot be converted into a type int!");
				}

				if (Double.MIN_VALUE < number & number < Double.MAX_VALUE) {
					System.out.println(num + " can be converted into a type double!");
				} else {
					System.out.println(num + " cannot be converted into a type double!");
				}

				if (Short.MIN_VALUE < number & number < Short.MAX_VALUE) {
					System.out.println(num + " can be converted into a type short!");
				} else {
					System.out.println(num + " cannot be converted into a type short!");
				}

				if (Byte.MIN_VALUE < number && number < Byte.MAX_VALUE) {
					System.out.println(num + " can be converted into a type byte!");
				} else {
					System.out.println(num + " cannot be converted into a type byte!");
				}

				if (Float.MIN_VALUE < number & number < Float.MAX_VALUE) {
					System.out.println(num + " can be converted into a type float!");
				} else {
					System.out.println(num + " cannot be converted into a type float!");
				}
			}
			num = sc.nextLine();
		}
	}
}