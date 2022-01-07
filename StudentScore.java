package a9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StudentScore {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\saass/StudentScore.txt");
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(f));
		String s3 = "T00";
		br.readLine();
		for (int i = 0; i < 210; i++) {
			String s = br.readLine();
			// System.out.println(' ');
			if (!(s.substring(0, 3).equals(s3))) {
				System.out.println(s);
			}
			String di = "0123456789";
			for (int i1 = 3; i1 < 9; i1++) {
				if (di.indexOf(s.charAt(i1)) == -1) {
					System.out.println(s);
				}
			}
			if (s.charAt(10) == '-') {
				System.out.println(s);
			} else if (s.length() == 12) {
				// System.out.println(s);
				// System.out.println(s.length());
			} else {
				if (s.length() == 13) {
					String one = s.substring(10, 13);
					if (one.equals("100")) {
					}
				} else {
					System.out.println(s);
				}
			}
		}
	}
}