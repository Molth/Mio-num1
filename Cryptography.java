package a6;

public class Cryptography {
	public static void main(String[] args) {
		String str1 = new String("p apgp roziopc cjfl spgn zun zo czon ehpffnf lsn upcn zb lsn fzjoen bkhn puy lsn \r\n"
				+ "upcn zb lsn ehpff cjfl qn lsn fpcn kb mn mpul cptn p apgp roziopc nvnejlpqhn mn \r\n"
				+ "cjfl rozgkyn p cpku cnlszy lsn cpku cnlszy kf pu kuykeplzo puy p fkiupljon bzo \r\n"
				+ "apgp gkoljph cpeskun lz bkuy lsn nulox rzkul zb lsn roziopc bzo nvnejlkzu");
		str1 = str1.replace("p", "A");
		str1 = str1.replace("q", "B");
		str1 = str1.replace("e", "C");
		str1 = str1.replace("y", "D");
		str1 = str1.replace("n", "E");
		str1 = str1.replace("b", "F");
		str1 = str1.replace("i", "G");
		str1 = str1.replace("s", "H");
		str1 = str1.replace("k", "I");
		str1 = str1.replace("a", "J");
		str1 = str1.replace("t", "K");
		str1 = str1.replace("h", "L");
		str1 = str1.replace("c", "M");
		str1 = str1.replace("u", "N");
		str1 = str1.replace("z", "O");
		str1 = str1.replace("r", "P");
		str1 = str1.replace("d", "Q");
		str1 = str1.replace("o", "R");
		str1 = str1.replace("f", "S");
		str1 = str1.replace("l", "T");
		str1 = str1.replace("j", "U");
		str1 = str1.replace("g", "V");
		str1 = str1.replace("m", "W");
		str1 = str1.replace("v", "X");
		str1 = str1.replace("x", "Y");
		str1 = str1.replace("w", "Z");
		System.out.println(str1.toLowerCase());
	}
}