import java.util.Scanner;

/**
 * 
 * @author DerekSmith
 *Creation date: 3/21/17
 */

public class HotelProgram {

	public static void main(String[] args) {
		System.out.print("Password (q to quit): ");
		CustomerList newList = new CustomerList();
		
		boolean done = false; // done will end the whole program
		boolean done2 = false; // done2 will end Employee UI or Manager UI
		boolean done3 = false; // done3 will end options within the Employee/Manager UI's
		while (!done) {
			Scanner in = new Scanner(System.in);
			String password = in.nextLine();
			
			// Start of EMPLOYEE user interface
			if (password.equals("employee")) {
				System.out.println("Welcome Employee.");
				
				// Employee UI
				while (!done2) {
					System.out.printf("R) Reservation C) Check In/Out A) Room Availability B) Bill Q) To quit\r\n");
					String action = in.next().toUpperCase();
					
					// Reservation UI
					if (action.equals("R")) {
						while (!done3) {
							System.out.printf("N) New reservaiton C) Change reservation Q) Quit\r\n");
							String action2 = in.next().toUpperCase();
							
							// Creating a new reservation option
							if (action2.equals("N")) {
								System.out.print("Customer first name: ");
								String fName = in.next();
								System.out.print("Customer last name: ");
								String lName = in.next();
								newList.add(fName, lName);
							}
							
							// Changing a reservation option
							else if (action2.equals("C")) {
							
							}
							
							
							// Quit reservation option
							else if (action2.equals("Q")) {
								done3 = true;
							}
							
							// Incorrect input
							else {
								System.out.println("Sorry, that was incorrect input.");
							}
						}
					}
						
					// Checking In/Out UI
					else if (action.equals("C")) {
						while (!done3) {
							
						}
						
					}
					
					// Room Availability UI
					else if (action.equals("A")) {
						while (!done3) {
							
						}
						
					}
						
					// Billing UI
					else if (action.equals("B")) {
						while (!done3) {
							
						}
						
					}
						
					// Quit option
					else if (action.equals("Q")) {
						done2 = true;
					}
						
					// Incorrect input
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
				while (!done2) {
					System.out.printf("R) Reservation C) Check In/Out A) Room Availability B) Bill Q) To quit\r\n");
					String action = in.next().toUpperCase();
					
					// Reservation UI
					if (action.equals("R")) {
						while (!done3) {
							System.out.printf("N) New reservaiton C) Change reservation Q) Quit\r\n");
							String action2 = in.next().toUpperCase();
							
							// Creating a new reservation option
							if (action2.equals("N")) {
								System.out.print("Customer first name: ");
								String fName = in.next();
								System.out.print("Customer last name: ");
								String lName = in.next();
								newList.add(fName, lName);
							}
							
							// Changing a reservation option
							else if (action2.equals("C")) {
							
							}
							
							
							// Quit reservation option
							else if (action2.equals("Q")) {
								done3 = true;
							}
							
							// Incorrect input
							else {
								System.out.println("Sorry, that was incorrect input.");
							}
						}
					}
						
					// Checking In/Out UI
					else if (action.equals("C")) {
						while (!done3) {
							
						}
						
					}
					
					// Room Availability UI
					else if (action.equals("A")) {
						while (!done3) {
							
						}
						
					}
						
					// Billing UI
					else if (action.equals("B")) {
						while (!done3) {
							
						}
						
					}
						
					// Quit option
					else if (action.equals("Q")) {
						done2 = true;
					}
						
					// Incorrect input
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
