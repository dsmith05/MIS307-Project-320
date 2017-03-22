import java.util.Scanner;

public class HotelProgram {

	public static void main(String[] args) {
		System.out.print("Password (q to quit): ");
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
						done2 = true;
					}
					else if (action.equals("A")) {
						done2 = true;
					}
					else if (action.equals("C")) {
						done2 = true;
					}
					else if (action.equals("B")) {
						done2 = true;
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
						done2 = true;
					} else if (action.equals("A")) {
						done2 = true;
					}
					else if (action.equals("C")) {
						done2 = true;
					}
					else if (action.equals("M")) {
						done2 = true;
					}
					else if (action.equals("B")) {
						done2 = true;
					}
					else if (action.equals("D")) {
						done2 = true;
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
