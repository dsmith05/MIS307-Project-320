/*
 * @ author Derek Smith
 * Creation date: 3/21/17
 */

import java.util.Scanner;

public class HotelProgram {

	public static void main(String[] args) {
		System.out.print("Password (q to quit): ");
		CustomerList newList = new CustomerList();
		boolean done = false;
		boolean done2 = false;
		while (!done) {
			Scanner in = new Scanner(System.in);
			String password = in.nextLine();
			
			// Start of EMPLOYEE user interface
			if (password.equals("employee")) {
				System.out.println("Welcome Employee.");
				
				// Employee UI
				System.out.printf("R) To make reservation A) To check room availibility C) To add charges B) To print bill Q) To quit\r\n");
				while (!done2) {
					String action = in.next().toUpperCase();
					if (action.equals("R")) {
						System.out.print("Customer first name: ");
						String fName = in.next();
						System.out.print("Customer last name: ");
						String lName = in.next();
						newList.add(fName, lName);
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges B) To print bill Q) To quit\r\n");
					}
					else if (action.equals("A")) {
						
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges B) To print bill Q) To quit\r\n");
					}
					else if (action.equals("C")) {
						
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges B) To print bill Q) To quit\r\n");
					}
					else if (action.equals("B")) {
						
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges B) To print bill Q) To quit\r\n");
					}
					else if (action.equals("Q")) {
						done2 = true;
					}
					else {
						System.out.println("Incorrect input.");
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges B) To print bill Q) To quit\r\n");
					}
					
				}
				
				done = true;
			}
			// Start of MANAGER user interface
			else if (password.equals("manager")) {
				System.out.println("Welcome Manager.");
				
				// Manager UI
				System.out.printf("R) To make reservation A) To check room availibility C) To add charges M) To remove charges B) To print bill D) To print daily report Q) To quit\r\n");
				while (!done2) {
					String action = in.next().toUpperCase();
					if (action.equals("R")) {
						
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges M) To remove charges B) To print bill D) To print daily report Q) To quit\r\n");
					} else if (action.equals("A")) {
						
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges M) To remove charges B) To print bill D) To print daily report Q) To quit\r\n");
					}
					else if (action.equals("C")) {
						
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges M) To remove charges B) To print bill D) To print daily report Q) To quit\r\n");
					}
					else if (action.equals("M")) {
						
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges M) To remove charges B) To print bill D) To print daily report Q) To quit\r\n");
					}
					else if (action.equals("B")) {
						
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges M) To remove charges B) To print bill D) To print daily report Q) To quit\r\n");
					}
					else if (action.equals("D")) {
						
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges M) To remove charges B) To print bill D) To print daily report Q) To quit\r\n");
					}
					else if (action.equals("Q")) {
						done2 = true;
					}
					else {
						System.out.println("Incorrect input.");
						System.out.printf("R) To make reservation A) To check room availibility C) To add charges B) To print bill Q) To quit\r\n");
					}
				}
				done = true;
			}
			// Option to quit out of password screen
			else if (password.equals("q")) {
				done = true;
			}
			// Incorrect password input
			else {
				System.out.println("The password is incorrect.");
				System.out.print("Password: ");
			}
			
		}
		
	}

}
