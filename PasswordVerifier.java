/*
	Title: Assignment 2 - Question 1
	Name: Cassandra Nicolak
	Student Number: 000971847
	MacID: nicolace
	Date: October 22, 2016
	Description: A program that requests a password from the user and then verifies if
				 the password is incorrect or if it is a successful administrator or guest 
				 password. 
 */

import java.util.Scanner;

public class PasswordVerifier {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in );
		
		System.out.printf("Welcome to The Password Verifier%n"              // Welcome Message
				+ "--------------------------------%n" );
	
		final String ADMIN__PASSWORD = "admin";                             // Fixed Passwords
		final String GUEST__PASSWORD = "guest";

		int attempts = 3;

		while (attempts <= 3 && attempts >= 1){                             
			System.out.println("Enter the password: (" + attempts + " attempt(s) left):");
			String userPassword = input.next();                             // Requests password from user for a maximum
			attempts--;                                                     // of 3 attempts.

			if (userPassword.equals("admin")) {                             // Verifies admin password and notifies user if
				System.out.println("Verified as administrator!");			// successful.
				break;                                                      
			} else if (userPassword.equals(GUEST__PASSWORD)) {				// Verifies guest password and notifies user if
				System.out.println("Verified as guest!");                   // successful.
				break;
			} else if (attempts == 0) {
				System.out.println("All verification attempts failed!");    // Notifies user that there are no more attempts.
				break;
			} else {
				System.out.println("Verification failed!");					// Notifies user that their current attempt failed.
			
				}
		}
		
	}

}
