package com.gaurav.programs.interview;

public class First100PrimeNumbers {

	public static void main(String[] args) {

		if (checkPrime(2))
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");

		// printFirstNPrimeNumbers();

	}

	private static void printFirstNPrimeNumbers() {
		int n = 100, firstNPrimeNumersCounter = 0, testNumber = 2;
		while (firstNPrimeNumersCounter <= n) {
			System.out.println("In while");
			if (checkPrime(testNumber)) {
				System.out.println(testNumber);
				firstNPrimeNumersCounter++;
			}
			testNumber++;

		}
	}

	private static boolean checkPrime(int num) {
			
		
		
		return false;

	}
}
