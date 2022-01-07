package a4;

public class ChessBoardColour {
	public static void main(String[] args) {
		ChessBoardColour cbc = new ChessBoardColour();
		cbc.checkColour('f', 1);
		cbc.checkColour('G', 7);
		cbc.checkColour('J', 1);
	}

	private void checkColour(char letter, int number) {
		letter = Character.toUpperCase(letter);
		if (letter == 'A' & number == 2 || letter == 'A' & number == 4 || letter == 'A' & number == 6
				|| letter == 'A' & number == 8 || letter == 'C' & number == 2 || letter == 'C' & number == 4
				|| letter == 'C' & number == 6 || letter == 'C' & number == 8 || letter == 'E' & number == 2
				|| letter == 'E' & number == 4 || letter == 'E' & number == 6 || letter == 'E' & number == 8
				|| letter == 'G' & number == 2 || letter == 'G' & number == 4 || letter == 'G' & number == 6
				|| letter == 'G' & number == 8 || letter == 'B' & number == 1 || letter == 'B' & number == 3
				|| letter == 'B' & number == 5 || letter == 'B' & number == 7 || letter == 'D' & number == 1
				|| letter == 'D' & number == 3 || letter == 'D' & number == 5 || letter == 'D' & number == 7
				|| letter == 'F' & number == 1 || letter == 'F' & number == 3 || letter == 'F' & number == 5
				|| letter == 'F' & number == 7 || letter == 'H' & number == 1 || letter == 'H' & number == 3
				|| letter == 'H' & number == 5 || letter == 'H' & number == 7) {
			System.out.println("Light");
		} else if (letter == 'A' & number == 1 || letter == 'A' & number == 3 || letter == 'A' & number == 5
				|| letter == 'A' & number == 7 || letter == 'C' & number == 1 || letter == 'C' & number == 3
				|| letter == 'C' & number == 5 || letter == 'C' & number == 7 || letter == 'E' & number == 1
				|| letter == 'E' & number == 3 || letter == 'E' & number == 5 || letter == 'E' & number == 7
				|| letter == 'G' & number == 1 || letter == 'G' & number == 3 || letter == 'G' & number == 5
				|| letter == 'G' & number == 7 || letter == 'B' & number == 2 || letter == 'B' & number == 4
				|| letter == 'B' & number == 6 || letter == 'B' & number == 8 || letter == 'D' & number == 2
				|| letter == 'D' & number == 4 || letter == 'D' & number == 6 || letter == 'D' & number == 8
				|| letter == 'F' & number == 2 || letter == 'F' & number == 4 || letter == 'F' & number == 6
				|| letter == 'F' & number == 8 || letter == 'H' & number == 2 || letter == 'H' & number == 4
				|| letter == 'H' & number == 6 || letter == 'H' & number == 8) {
			System.out.println("Dark");
		} else {
			System.out.println("Wrong Code!");
		}
	}
}