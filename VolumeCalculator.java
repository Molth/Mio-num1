package a3;

public class VolumeCalculator {
	public static void main(String[] args) {
		double V = 0;
		double r1 = 23.5;
		double r2 = 17.39;
		double r3 = 4.39;
		double h1 = 24.3293;
		double h2 = 23.16;
		double h3 = 31;
		double h4 = 20;
		double h5 = 11.9999;
		V = 3.14 * Math.pow(r3, 2) * h5 + 3.14 * Math.pow(r2, 2) * h3 + 3.14 * Math.pow(r1, 2) * h1
				+ 3.14 * ((Math.pow(r3, 2) + Math.pow(r2, 2) + r2 * r3) * h4) / 3
				+ 3.14 * ((Math.pow(r2, 2) + Math.pow(r1, 2) + r2 * r1) * h2) / 3;
		System.out.println(V * Math.pow(10, -6));
	}
}