package practice;

public class marchTwoFive {

	public static void main(String[] args) {
		
	System.out.println(getDurationString(3945));
	System.out.println(getDurationString(65, 45));
	
	
	/* 
	 * System.out.println(convertToCentimeters(61));
	 * System.out.println(convertToCentimeters(5,1));
	 */

	}

	/*
	public static double convertToCentimeters(int inches) {
		double result = (double) (inches * 2.54);
		return result;
	}
	
	public static double convertToCentimeters(int feet, int inches) {
		int feetToInch = (feet * 12) + inches;
		double inchToCM = convertToCentimeters(feetToInch);
		return inchToCM;
	}
	
	*/
	
	public static String getDurationString(int seconds) {
		String result = "result";
		
		if (seconds >= 0) {
			int minutes = seconds / 60;
			seconds = seconds % 60;
			result = getDurationString(minutes, seconds);}
		else {
			result = "Invalid input. Please enter a number greater than or equal to zero.";
		}
		
		return result;
		
	}
	
	public static String getDurationString(int minutes, int seconds) {
		int hours = minutes / 60;
		int remMinutes = minutes % 60;
		int remSeconds = seconds % 60;
		String result = "result";
		
		if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
			result = hours + "h " + remMinutes + "m " + remSeconds + "s";}
		else {
			result = "Invalid inputs. Please enter a number for minutes greater than or equal to zero and for seconds, a number greater than or equal to zero but less than or equal to 59.";
		}
		
		return result;

	}
}

