package a9;

import java.util.Scanner;

public class BarRotator1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[][] sec = { 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
		int[][] fac = { 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
		for (int n = 0; n < 12; n++) {
			for (int j = 0; j < 12; j++) {
				if (n == 5 | n == 6) {
					sec[n][j] = 0;
				} else {
					sec[n][j] = 1;
				}
			}
		}
		System.out.println("First Output : \r\n");
		for (int f = 0; f < 12; f++) {
			for (int j = 0; j < 12; j++) {
				System.out.print(sec[f][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\r\nInput: ");
		String input = sc.nextLine();
		while (!input.equals("exit")) {
			for (int n = 0; n < 12; n++) {
				for (int j = 0; j < 12; j++) {
					fac[n][j] = 1;
				}
			}
			int i = Integer.parseInt(input);		
			// test
			if (i != 0 & i != 45 & i != 90 & i != 135 & i != 180 & i != 225 & i != 270 & i != 315 & i != 360) {
				System.out.println("Please choose a number from (45,90,135,180,225,270,315,360) : ");
				input = sc.nextLine();
				continue;
			} else {
				// 0,180,360
				if (i == 0 | i == 180 | i == 360) {
					for (int n = 0; n < 12; n++) {
						for (int j = 0; j < 12; j++) {
							if (j == 5 | j == 6) {
								fac[j][n] = 0;
							} else {
								fac[j][n] = 1;
							}
						}
					}
				}
				// 45,225
				if (i == 45 | i == 225) {
					for (int n = 0, j = 1; n < 12 & j < 12; n++, j++) {
						fac[n][j] = 0;
					}
					for (int n = 1, j = 0; n < 12 & j < 12; n++, j++) {
						fac[n][j] = 0;
					}
				}
				// 90,270
				if (i == 90 | i == 270) {
					for (int n = 0; n < 12; n++) {
						for (int j = 0; j < 12; j++) {
							if (j == 5 | j == 6) {
								fac[n][j] = 0;
							} else {
								fac[n][j] = 1;
							}
						}
					}
				}
				// 135,315
				if (i == 135 | i == 315) {
					for (int n = 0, j = 10; n < 12 & j >= 0; n++, j--) {
						fac[n][j] = 0;
					}
					for (int n = 1, j = 11; n < 12 & j >= 0; n++, j--) {
						fac[n][j] = 0;
					}
				}
				// run
				for (int f = 0; f < 12; f++) {
					for (int j = 0; j < 12; j++) {
						System.out.print(fac[f][j] + " ");
					}
					System.out.println();
				}
				input = sc.nextLine();
			}
		}
		System.out.println("End");
	}
}