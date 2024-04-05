package com.coderscampus;

import java.util.Scanner;

public class Week2Example {

	public static void main(String[] args) {
		Integer userInput = numberInRange();

			System.out.println("The number you typed in was: " + userInput);
		
	}

	static Integer numberInRange() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300:");
		String userInput = scanner.nextLine();

		int number = Integer.parseInt(userInput);

		if (number >= 50 && number <= 300) {
			return number;
		} else {
			return null;

		}
	}
	
}