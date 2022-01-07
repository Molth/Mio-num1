package a3;

public class WCTCalculator {
	public static void main(String[] args) {
		double v = 20;
		double Twc = 0;
		double Tf = 31.4;
		Twc = 35.74 + 0.6215 * Tf - 35.75 * Math.pow(v, 0.16) + 0.4275 * Tf * Math.pow(v, 0.16);
		if (2 < v & -51 < Tf & Tf < 41) {
			System.out.println(Twc);
		} else {
			System.out.println(false);
		}
	}
}