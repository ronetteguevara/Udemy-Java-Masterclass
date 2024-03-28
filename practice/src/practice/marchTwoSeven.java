package practice;

public class marchTwoSeven {

	public static void main(String[] args) {
		
		/*
		int firstNum = 4; 
		int lastNum = 20;
		int evenCounter = 0;
		int oddCounter = 0;
	
		while (firstNum <= lastNum) {
			firstNum++;
			
			if (evenCounter >= 5) {
				break;
			}
			
			
			if (isEvenNumber(firstNum)) {
				evenCounter++;
				System.out.println("Even number " + firstNum + " | Total even numbers: " + evenCounter + " | Total odd numbers: " + oddCounter);
			 }
			else {
				oddCounter++;
				System.out.println("Odd number " + firstNum + "  | Total even numbers: " + evenCounter + " | Total odd numbers: " + oddCounter);
			}

		} */

		System.out.println("The sum of the digits are: " + sumDigits(7234));
		System.out.println("The sum of the digits are: " + sumDigits(-125));
		System.out.println("The sum of the digits are: " + sumDigits(4));
		System.out.println("The sum of the digits are: " + sumDigits(32123));
		
	}

	public static boolean isEvenNumber(int number) {
		boolean result = true; 
		
		if (number % 2 == 0) {
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	 public static int sumDigits(int number) {
		 int sum = 0;
		 
		 if (number >= 0) {
			 int i = 0;
			 while (i <= number) {
				 i++;
				 int lastDigit = number % 10;
				 int secondToLastDigits = 0;
				 int thirdToLastDigits = 0; 
				 int fourthToLastDigits = 0;
				 int fifthToLastDigits = 0;
				 
				 if (number >= 10000) {
					 secondToLastDigits = ((number % 1000) % 100) / 10;
					 thirdToLastDigits = (number % 1000) / 100;
					 fourthToLastDigits = (number % 10000) / 1000;
					 fifthToLastDigits = number / 10000;
					 sum = lastDigit + secondToLastDigits + thirdToLastDigits + fourthToLastDigits + fifthToLastDigits;
					 
				 }
				 
				 else 
					 if (number >= 1000) {
					 secondToLastDigits = ((number % 1000) % 100) / 10;
					 thirdToLastDigits = (number % 1000) / 100;
					 fourthToLastDigits = number / 1000;
					 sum = lastDigit + secondToLastDigits + thirdToLastDigits + fourthToLastDigits;
					 
				 }
				 else if (number >= 100) {
					 secondToLastDigits = ((number % 1000) % 100) / 10;
					 thirdToLastDigits = (number % 1000) / 100;
					 sum = lastDigit + secondToLastDigits + thirdToLastDigits;
				 }
				 else if (number >= 10) {
					 secondToLastDigits = ((number % 1000) % 100) / 10;
					 sum = lastDigit + secondToLastDigits;
					 
				 }
				 else {
					 sum = lastDigit;
				 }
			 }
			 
		 }
		 else {
			 sum = -1;
		 }
		 
		 return sum;
		 
	 }
	
}
