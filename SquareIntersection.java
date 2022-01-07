package a4;

public class SquareIntersection {
	public static void main(String[] args) {
		int x1 = 6, y1 = 7, r1 = 3;
		int x2 = 4, y2 = 5, r2 = 7;
		if (x1 - r1 * 0.5 >= x2 - r2 * 0.5 & x1 + r1 * 0.5 <= x2 + r2 * 0.5 & y1 - r1 * 0.5 >= y2 - r2 * 0.5
				& y1 + r1 * 0.5 <= y2 + r2 * 0.5) {
			System.out.println("Square2 contains with Square1.");
		} else if (x1 - r1 * 0.5 <= x2 - r2 * 0.5 & x1 + r1 * 0.5 >= x2 + r2 * 0.5 & y1 - r1 * 0.5 <= y2 - r2 * 0.5
				& y1 + r1 * 0.5 >= y2 + r2 * 0.5) {
			System.out.println("Square1 contains with Square2.");
		} else if (x1 - r1 * 0.5 > x2 + r2 * 0.5 || x2 - r2 * 0.5 > x1 + r1 * 0.5 || y1 - r1 * 0.5 > y2 + r2 * 0.5
				|| y2 - r2 * 0.5 > y1 + r1 * 0.5) {
			System.out.println("The two squares are apart from each other.");
		} else {
			System.out.println("Square1 intersects with Square2.");
		}
	}
}