package a8;

public class Removeduplicate2 {
	public static void main(String[] args) {
		String a = new String("10224735784769494261108323388" + "99437170338449409627474102214022150928");
		int[] b = new int[10];
		int max = 0;
		for (int i = 0; i < a.length(); i++) {
			b[a.charAt(i) - '0']++;
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] > max) {
				max = b[i];
			}
		}
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 10; j++) {
				if (b[j] >= (max - i))
					System.out.print("[" + j + "]");
				else {
					System.out.print("   ");
				}
				if (j < 9)
					System.out.print(" ");
			}
			if (i < max - 1)
				System.out.println();
		}
	}
}