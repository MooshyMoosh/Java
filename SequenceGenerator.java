/*
	Title: Assignment 2 - Question 2
	Name: Cassandra Nicolak
	Student Number: 000971847
	MacID: nicolace
	Date: October 22, 2016
	Description: A program that asks the user for a positive integer less than or equal to 100, then 
				 uses this number as the first element of a sequence. The program then computes and outputs
				 the sequence:
				 
				 C_i+1 = { C_i / 2		if n = 0 (i mod 2)
				 		 { 6* C_i + 2	if n = 1 (i mod 2)
				 		 
				 in which C_i (i > 1) is the ith element of the sequence
 */

import java.util.Scanner;

public class SequenceGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in );
		
		System.out.printf("Welcome to The Sequence Generator%n"   // Welcome Message
				+ "---------------------------------%n" );
		                                                      
		System.out.println("Please Enter a positive integer no more than 100: ");   // Requests the user input a positive integer.
		
		while (!input.hasNextInt()) input.next();			      // Keeps reading until user enters a valid int number.
			int inputNumber = input.nextInt();		
			if (inputNumber >= 1 && inputNumber <= 100){	      // Performs range check.
			
				int n = inputNumber;
				int count = 0;
				
				while ((n/2) > 0){
					
					if (n%2 == 0){						          // Formatting for numbers:
						System.out.printf("[" + n + "] ");	      // Prints [] around even numbers.
					} else {
						System.out.printf("(" + n + ") ");	      // Prints () around odd numbers.
					}
					
			
					if (n%2 == 0){							      // Sequence: if (i mod 2 = 0) then divide previous number by 2.
						n = n/2;
					} else {
						n = 6*n+2;                                // Sequence: if (i mod 2 = 1) then multiply previous number 
					}                                             //           by 6 and add 2.
				
					count++;
					
					if (count == 20){
						System.out.printf("%n");			      // Prints the sequence in lines of no more than 20 elements
					}                                             // (except last line).
				}
				
				
			} else {
				System.out.println("Invalid Input");		      // Error for failed range check.
			}
        
	}
		
}
