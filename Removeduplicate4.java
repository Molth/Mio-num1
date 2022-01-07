package a8;

public class Removeduplicate4 {
	public static void main(String[] args) {
		String num = "1022473578476949426110832338899437170338449409627474102214022150928";
		int j = 0;
		int b = 0;
		int array[] = new int[200];
		for (int a = 0; a < 10; a++) {
			char c = '0';
			for (int i = 0; i < num.length(); i++) {
				if (num.charAt(i) == c + a) {
					j++;
				}
			}
			array[a] = j;
			j = 0;
		}
		for (int f = 0; f < array.length; f++) {
			if (b <= array[f]) {
				b = array[f];
			}
		}
		int n = b;
		for (int d = 0; d < b; d++) {
			for (int e = 0; e < b; e++) {
				if (array[e] == n) {
					System.out.print(" "+"[" + e + "]" + " ");
					array[e]--;
				} else
					System.out.print("     ");
			}
			n--;
			System.out.println(' ');
		}
	}
}