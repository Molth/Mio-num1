package a4;

public class ScheduleValidator {
	public static void main(String[] args) {
		int startTime1 = 1215;
		int endTime1 = 2030;
		int startTime2 = 820;
		int endTime2 = 1345;
		if (endTime1 < startTime2 || endTime2 < startTime1) {
			System.out.println("Perfectly scheduled!");
		} else if (startTime1 < startTime2) {
			System.out.println("Appointment1 ¨C Appointment2");
		} else {
			System.out.println("Appointment2 ¨C Appointment1");
		}
	}
}