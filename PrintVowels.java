package a6;

public class PrintVowels {
	public static void main(String[] args) {
		String str = "A Java program must have one or more classes. The name of the source file and \r\n"
				+ "the name of the class must be the same. If we want make a Java program \r\n"
				+ "executable, we must provide a main method. The main method is an indicator \r\n"
				+ "and a signature for Java Virtual Machine to find the entry point of the program \r\n"
				+ "for execution.";
		str = str.replace('.', ' ').replace(',', ' ');
		String a = "", b = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != ' ') {
				a = a + str.charAt(i);
			} else {
				for (int n = 0; n <= a.length() - 1; n++) {
					if (a.charAt(n) == 'a' || a.charAt(n) == 'e' || a.charAt(n) == 'i' || a.charAt(n) == 'o'
							|| a.charAt(n) == 'u') {
						b = a + b;
						a = " ";
					}
				}
			}
		}
		System.out.println(b);
	}
}