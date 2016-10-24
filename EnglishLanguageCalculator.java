/*
	Title: Assignment 2 - Question 3
	Name: Cassandra Nicolak
	Student Number: 000971847
	MacID: nicolace
	Date: October 22, 2016
	Description: An "English language" calculator program that performs simple arithmetic.
				 Output numbers are in English.
 */

import java.util.Scanner;

public class EnglishLanguageCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in );

        while (true)	                                                            // Loop for if the user would like to continue.
        {
		
		System.out.println("Enter first number [single digits]: ");		            // Asks the user to enter the first number.
		while (!input.hasNextInt()) input.next();						            // Continues only if input is an int value.
		int firstNumber = input.nextInt();

		System.out.println("Enter operation [*, /, +, -, ^]: ");		            // Asks the user to enter the operation.
		String operation = input.next();
		
		System.out.println("Enter second number [single digits]: ");	            // Asks the user to enter the first number.
		while (!input.hasNextInt()) input.next();						            // Continues only if input is an int value.
		int secondNumber = input.nextInt();
		
		String[] englishCapital = {"Zero", "One", "Two", "Three", "Four", "Five",	// Array for English first number words
							"Six", "Seven", "Eight", "Nine"};                       // (first letter capitalized).
		String[] english = {"zero", "one", "two", "three", "four", "five",		    // Array for English second number words
							"six", "seven", "eight", "nine"};                       // (all lowercase).
		
		
        int output = 0;

        if(firstNumber < 0 || firstNumber > 9 || secondNumber < 0 || secondNumber > 9) { 	// Checks if number is a single digit.
             System.out.println("Invalid input");
        } 
           else if (operation.equals("+"))			                                // Addition
        {
            output = firstNumber + secondNumber;
            System.out.println(englishCapital[firstNumber] + " plus " + english[secondNumber] + " is " + output);
        }
            else if (operation.equals("-"))			                                // Subtraction
        {
            output = firstNumber - secondNumber;
            System.out.println(englishCapital[firstNumber] + " minus " + english[secondNumber] + " is " + output);
        }
            else if (operation.equals("*"))			                                // Multiplication
        {   
           output = firstNumber * secondNumber;
           System.out.println(englishCapital[firstNumber] + " multiplied by " + english[secondNumber] + " is " + output);
        }
            else if (operation.equals("/"))			                                // Division
        {
            if(secondNumber == 0) {											
                System.out.println("Division by zero is not allowed");	            // Cannot divide by zero error.
             } else {
             output = firstNumber/secondNumber;
             System.out.println(englishCapital[firstNumber] + " divided by " + english[secondNumber] + " is " + output);
             }
        }
            else if(operation.equals("^"))			                                // Power of
        {
             output = (int) Math.pow(firstNumber , secondNumber);
             System.out.println(englishCapital[firstNumber] + " to power of " + english[secondNumber] + " is " + output);
        } else {
            System.out.println("Invalid operation");					            // Invalid input error.
        }
		
		
        System.out.println("Would you like to continue?");				            // Asks user if they would like to continue.
		
		while (!input.hasNext()) input.next();
		String again = input.next();
		
		if (!(again.equals("Y") || again.equals("y") || again.equals("YES") || 
				again.equals("yes") || again.equals("Yes")))
            break;
        }
        
	}

}
