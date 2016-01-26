/**
 * 
 */
package com.sqa.mc.calculator;

import java.util.Scanner;

/**
 * @author mc
 *
 */
public class MortgageClass {

	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables for the property id
		String propertyID;

		// String input for principle, interest rate and term in months
		String input;

		// Double principal because it is a decimal poingt
		double principle;

		// for interest
		double interest;

		// for term months
		int termMonths;

		// add another variable that would be a monthly payment
		double monthlyPayment;

		// Initialized the variable from below
		boolean hasMoreHomes = false;

		// Welcome the user
		System.out.println("Welcome user!");

		do {
			// Ask user what the property id is
			System.out.print("What your property ID ? ");
			// Get the property ID and store in a variable (so declare above)
			propertyID = scanner.nextLine();
			// Ask user what the principle (ex 2000000), interest (.0575) and
			// term
			// in months (360)
			// Ask user what the principle is
			System.out.print("What is the principle : ");
			// Get the principle and store it in a variable input
			input = scanner.nextLine();
			// Convert input string to a double type variable
			principle = Double.parseDouble(input);
			// Ask user what the interest is
			System.out.print("What is the interest : ");
			// Get the principle and store it in a variable input
			input = scanner.nextLine();
			// Convert input String to a double type variable
			interest = Double.parseDouble(input);
			// Ask user what the term in months is
			System.out.print("What is the term in months : ");
			// Get the principle and store it in a variable input
			input = scanner.nextLine();
			// Convert input string to a double type variable
			termMonths = Integer.parseInt(input);
			// Calculate the payments based on the formula: payment = principal
			// *
			// (interest / math.pow (1 / 1 + interest), termMonths)
			// used variable from the top - double monthlyPayment
			monthlyPayment = (principle * interest) / (1 - Math.pow(1 + interest, -termMonths));
			// What the payments should be for each month - math puts it to the
			// floor (double type and you divide it by 12)
			// Output information tot he user
			System.out.println("Your monthly payments for " + propertyID + " will be " + Math.round(monthlyPayment)
					+ " for a total of " + termMonths / 12 + " years and " + termMonths % 12 + " months.");

			// Would you like to find out the mortgage of another home?
			while (true) {

				System.out.print("Would you like to calculate mortgage for another home? (Yes/Y or No/N)");
				input = scanner.nextLine();
				if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y")) {
					hasMoreHomes = true;
					break;
				} else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("N")) {
					hasMoreHomes = false;
					break;
				} else {
					System.out.println("Invalid Input");
					continue;
				}
			}
		} while (hasMoreHomes);
		// Say farewell to the user
		System.out.println("Thank you for using the Mortgage Calculator application. \nGood Bye");
		// Close the Scanner object
		scanner.close();
		// exit the System
		System.exit(0);
	}
}