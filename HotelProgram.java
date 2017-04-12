import java.util.Scanner;

/**
 * 
 * @author DerekSmith
 * Creation date: 3/21/17
 *
 */

public class HotelProgram {

	public static void main(String[] args) {
		
		// Creates customer object list
		CustomerList custList = new CustomerList();
		Rooms roomsObj = new Rooms();
		
		
		boolean done = false; // done will end the whole program
		boolean done2 = false; // done2 will end Employee UI or Manager UI
		boolean done3 = false; // done3 will end options within the Employee/Manager UI's
		while (!done) {
			// Password Screen
			System.out.print("Password (q to quit): ");
			Scanner in = new Scanner(System.in);
			String password = in.nextLine();
			
			// Start of EMPLOYEE user interface
			if (password.equals("employee")) {
				System.out.println("Welcome Employee.");
				
				// Employee UI
				while (!done2) {
					done3 = false;
					System.out.println("C) Check In/Out N) New Customer A) Room Availability B) Bill Q) To Quit");
					String action = in.next().toUpperCase();
						
					// Checking In/Out UI
					if (action.equals("C")) {
						while (!done3) {
							System.out.println("I) Check In O) Check Out Q) Quit");
							String action2 = in.next().toUpperCase();
							
							// Option to check in
							if (action2.equals("I")) {
								
							}
							
							// Option to check out
							else if (action2.equals("O")) {
								
							}
							
							// Option to quit Check In/Out
							else if (action2.equals("Q")) {
								done3 = true;
							}
							
							// Incorrect input
							else {
								System.out.println("Sorry, that was incorrect input.");
							}
						}
					}
					
					// New Customer UI
					else if (action.equals("N")) {
						System.out.print("Customer first name: ");
						String fName = in.next();
						System.out.print("Customer last name: ");
						String lName = in.next();
						custList.add(fName, lName);
						int index = custList.findByLast(lName);
						System.out.println(fName + " " + lName + " Customer ID is " + custList.getCustomer(index).getID());
						
					}
					
					// Room Availability UI
					else if (action.equals("A")) {
						while (!done3) {
							System.out.println("R) Room Availibility A) Add Room R) Remove Room Q) Quit");
							String action2 = in.next().toUpperCase();
							
							// Option to check room availability
							if (action2.equals("R")) {
								roomsObj.getRooms();
								done3 = true;
							}
							
							// Option to add rooms
							else if (action2.equals("A")) {
								System.out.println("Single Rooms?: ");
							    roomsObj.addSingle(in.nextInt());
							    System.out.println("Double Rooms?: ");
							    roomsObj.addDouble(in.nextInt());
							    System.out.println("Triple Rooms?: ");
							    roomsObj.addTriple(in.nextInt());
							    roomsObj.getRooms();
							    done3 = true;
							}
							
							// Option to remove rooms
							else if (action2.equals("R")) {
								System.out.println("Single Rooms?: ");
					            roomsObj.removeSingle(in.nextInt());
					            System.out.println("Double Rooms?: ");
					            roomsObj.removeDouble(in.nextInt());
					            System.out.println("Triple Room?");
					            roomsObj.removeTriple(in.nextInt());
					            roomsObj.getRooms();
					            done3 = true;
							}
							
							// Option to quit Room Availability
							else if (action2.equals("Q")) {
								done3 = true;
							}
							
							// Incorrect input
							else {
								System.out.println("Sorry, that was incorrect input.");
							}
						}
					}
	
					// Billing UI
					else if (action.equals("B")) {
						while (!done3) {
							System.out.println("P) Print Bill A) Add Charge R) Remove Charge Q) Quit");
							String action2 = in.next().toUpperCase();
							
							// Prints the bill
							if (action2.equals("P")) {
								
							}
							
							// Adds charge to the bill
							else if (action2.equals("A")) {
								
								
							}
							
							// Removes charge from the bill
							else if (action2.equals("R")) {
								
								
							}
							
							// Quit bill option
							else if (action2.equals("Q")) {
								done3 = true;
							}
							
							// Incorrect input
							else {
								System.out.println("Sorry, that was incorrect input.");
							}
						}
						
					}
						
					// Quit option
					else if (action.equals("Q")) {
						done2 = true;
					}
						
					// Incorrect input
					else {
						System.out.println("Incorrect input.");
					}	
				}
			}
			
			// Option to quit out of password screen
			else if (password.equals("q")) {
				done = true;
			}
			
			// Incorrect password input
			else {
				System.out.println("Incorrect password.");
				System.out.print("Password: ");
			}
		}
	}
}
