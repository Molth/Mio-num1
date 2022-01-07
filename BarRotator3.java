package a9;

import java.util.Scanner;

public class BarRotator3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[][] bar0 = new int[12][12];
		int[][] bar = new int[12][12];
		for (int h = 0; h < 12; h++) {
			for (int l = 0; l < 12; l++) {
				if (h == 5 || h == 6) {
					bar0[h][l] = 0;
				} else {
					bar0[h][l] = 1;
				}
			}
		}
		System.out.println("First");
		for (int h2 = 0; h2 < 12; h2++) {
			for (int l = 0; l < 12; l++) {
				System.out.print(bar0[h2][l] + "  ");
			}
			System.out.println();
		}
		System.out.println("Input(0£¨45£¨90£¨135£¨180£¨225£¨270£¨315£¨360÷–)");
		String input = sc.nextLine();

		while (!input.equals("exit")) {
			boolean b = false;
			for (int h = 0; h < 12; h++) {
				for (int l = 0; l < 12; l++) {
					bar[h][l] = 1;
				}
			}
			int i = Integer.parseInt(input);
			// 90,270
			if (i == 90 | i == 270) {
				for (int h = 0; h < 12; h++) {
					for (int l = 0; l < 12; l++) {
						if (l == 5 || l == 6) {
							bar[h][l] = 0;
						} else {
							bar[h][l] = 1;
						}
					}
				}
			}
			// 180
			if (i == 180 | i == 360 | i == 0) {
				for (int h = 5; h < 7; h++) {
					for (int l = 0; l < 12; l++) {
						bar[h][l] = 0;
					}
				}
			}
			// 45,22 5
			if (i == 45 | i == 225) {
				for (int h = 0, l = 1; h < 12 && l < 12; h++, l++) {
					bar[h][l] = 0;
				}
				for (int h = 1, l = 0; h < 12 && l < 12; h++, l++) {
					bar[h][l] = 0;
				}
			}
			if (i == 135 | i == 315) {
				for (int h = 0, l = 10; h < 12 && l >= 0; h++, l--) {
					bar[h][l] = 0;
				}
				for (int h = 1, l = 11; h < 12 && l >= 0; h++, l--) {
					bar[h][l] = 0;
				}
			}
			// ºÏ—È
			int[] ch = { 0, 45, 90, 135, 180, 225, 270, 315, 360 };
			for (int i1 = 0; i1 < ch.length; i1++) {
				if (i == ch[i1]) {
					b = true;
				}
			}
			if (b == false) {
				System.out.println("Input a true number");
			} else {
				for (int h2 = 0; h2 < 12; h2++) {
					for (int l = 0; l < 12; l++) {
						System.out.print(bar[h2][l] + "  ");
					}
					System.out.println();
				}
			}
			input = sc.nextLine();
		}
		System.out.println("ENd");
	}
}
