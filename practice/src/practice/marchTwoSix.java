package practice;

public class marchTwoSix {

	public static void main(String[] args) {
		
		/*
		int value = 1;
		if (value == 1) {
			System.out.println("Value was 1");
		} else if (value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("Was not 1 or 2");
		}
	
		
		char letter = 'A';
		
		switch (letter) {
		
		case 'A':
			System.out.println("A is Able");
			break;
		case 'B':
			System.out.println("B is Bravo");
			break;
		case 'C':
			System.out.println("C is Charlie");
			break;
		case 'D':
			System.out.println("D is Dog");
			break;
		case 'E':
			System.out.println("E is Echo");
			break;
		default:
			System.out.println("Letter " + letter + " was not found in the switch");
			break;
		}
		
		System.out.println(printDayOfWeek(0));
		System.out.println(printDayOfWeek(1));
		System.out.println(printDayOfWeek(2));
		System.out.println(printDayOfWeek(3));
		System.out.println(printDayOfWeek(4));
		System.out.println(printDayOfWeek(5));
		System.out.println(printDayOfWeek(6));
		System.out.println(printDayOfWeek(7));
		
		System.out.println(printDayOfWeekIfElse(0));
		System.out.println(printDayOfWeekIfElse(1));
		System.out.println(printDayOfWeekIfElse(2));
		System.out.println(printDayOfWeekIfElse(3));
		System.out.println(printDayOfWeekIfElse(4));
		System.out.println(printDayOfWeekIfElse(5));
		System.out.println(printDayOfWeekIfElse(6));
		System.out.println(printDayOfWeekIfElse(7));
		
		double amount = 100.0;
		
		for (double interestRate =  7.5; interestRate <= 10; interestRate += 0.25) {
			double result = calculateInterest(100, interestRate);
			System.out.println(amount + " at " + interestRate + "% interest = $" + result);
			}
		
		int counter = 0;
		
		for (int i = 1; i <= 50; i++) {
		
			if (isPrime(i) == true) {
				counter += 1;
				System.out.println("Number " + i + " is a prime number");
			}
			
			if (counter == 3) {
				System.out.println("Found three prime numbers. Exiting for loop.");
				break;
			}
		}
		
		int counter = 0;
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
				counter += 1;
				System.out.println(i + " is divisible by both 3 and 5.");
			}
			
			if (counter == 5) {
				System.out.println("Found five numbers than met all conditions totaling " + sum + ". Exiting for loop.");
				break;
			}
		} */
		  
	}
	
	public static String printDayOfWeek(int day) {
		
	String dayOfTheWeek = " ";
	
	return switch(day) {
	
		case 0 -> {
			dayOfTheWeek = "Sunday";
			yield day + " is " + dayOfTheWeek;
		}
		case 1 -> {
			dayOfTheWeek = "Monday";
			yield day + " is " + dayOfTheWeek;
		}
		case 2 -> {
			dayOfTheWeek = "Tuesday";
			yield day + " is " + dayOfTheWeek;
		}
		case 3 -> {
			dayOfTheWeek = "Wednesday";
			yield day + " is " + dayOfTheWeek;
		}
		case 4 -> {
			dayOfTheWeek = "Thursday";
			yield day + " is " + dayOfTheWeek;
		}
		case 5 -> {
			dayOfTheWeek = "Friday";
			yield day + " is " + dayOfTheWeek;
		}
		case 6 -> {
			dayOfTheWeek = "Saturday";
			yield day + " is " + dayOfTheWeek;
		}
		default -> {
			yield day + " is an Invalid Day";
		}
	  };
    }
	
	public static String printDayOfWeekIfElse(int day) {
		String dayOfTheWeek = "Sunday";
		
		if (day == 0) {
			dayOfTheWeek = "Sunday";
		}
		else if (day == 1) {
			dayOfTheWeek = "Monday";
		}
		else if (day == 2) {
			dayOfTheWeek = "Tuesday";
		}
		else if (day == 3) {
			dayOfTheWeek = "Wednesday";
		}
		else if (day == 4) {
			dayOfTheWeek = "Thursday";
		}
		else if (day == 5) {
			dayOfTheWeek = "Friday";
		}
		else if (day == 6) {
			dayOfTheWeek = "Saturday";
		}
		else {
			dayOfTheWeek = "an Invalid Day";
		}
		
		String finalString = day + " is " + dayOfTheWeek;
		return finalString;
	}
	 
	public static double calculateInterest(double amount, double interestRate) {
		double result = amount * (interestRate / 100);
		return result;
		
		}
	
	public static boolean isPrime(int wholeNumber) {
		
		if (wholeNumber <= 2) {
			return (wholeNumber == 2);
		}
		
		for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
			if (wholeNumber % divisor == 0) {
				return false;
			}
		}
		
		return true;
	}
	}


