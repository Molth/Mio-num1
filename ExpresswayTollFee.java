package a4;

public class ExpresswayTollFee {
	public static void main(String[] args) {
		char a = 'm';
		if (a == 'c') {
			System.out.println("Car-" + "2.00");
		}
		if (a == 'm') {
			System.out.println("Motorbike-" + "1.10");
		}
		if (a == 'b') {
			System.out.println("Bus-" + "4.25");
		}
		if (a == 't') {
			System.out.println("Truck-" + "6.70");
		}
		if (a == 'v') {
			System.out.println("Van-" + "4.00");
		}
	}
}