package a3;

public class EasterSunday {
	public static void main(String[] args) {
		int year = 2020, num1, num2a, num2b, num3a, num3b, num4, num5, num6a, num6b, num7, num8, num9, num10;
		num1 = year % 19;
		num2a = year / 100;
		num2b = year % 100;
		num3a = num2a / 4;
		num3b = num2a % 4;
		num4 = (num2a * 8 + 13) / 25;
		num5 = (num1 * 19 + num2a - num3a - num4 + 15) % 30;
		num6a = num2b / 4;
		num6b = num2b % 4;
		num7 = (num1 + num5 * 11) / 319;
		num8 = (num3b * 2 + num6a * 2 - num6b - num5 + num7 + 32) % 7;
		num9 = (num5 - num7 + num8 + 90) / 25;
		num10 = (num5 - num7 + num8 + num9 + 19) % 32;
		System.out.println(num10);
		System.out.println(num9);
		System.out.println(year);
	}
}