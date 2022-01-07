package a9;

import java.util.Scanner;

public class BarRotator2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[][] array = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
		int n = array.length;
		String sec = sc.nextLine();
		while (!sec.equals("exit")) {
			int ac = Integer.parseInt(sec);
			int[][] num = new int[n][n];
			if (ac == 90 | ac == 270) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						num[i][j] = array[i][j];
					}
				}
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						array[j][i] = num[n - i - 1][j];
					}
				}
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.printf(" " + array[i][j]);
					}
					System.out.println();
				}
				sec = sc.nextLine();
			}
		}
		System.out.println("End");
	}
}