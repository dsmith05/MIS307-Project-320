import java.util.Scanner;

/**
 * 
 * @author DerekSmith
 * Creation date: 3/21/17
 *
 */

public class HotelProgram {

	public static void main(String[] args) {
		
		// Creates List objects
		CustomerList custList = new CustomerList();
		RoomsList roomList = new RoomsList();
		IncidentalChargesList chargeList = new IncidentalChargesList();
		DailyReports reports = new DailyReports();
		BillingExpense bill = new BillingExpense();
		
		// Creates the Room objects
		// Single Rooms
		for (int i = 0; i < 10; i++) {
			int roomNum = 100 + i;
			roomList.addRoom(roomNum, "single", 100);
		}
		//Double Rooms
		for (int i = 0; i < 5; i++) {
			int roomNum = 200 + i;
			roomList.addRoom(roomNum, "double", 150);
		}
		// Triple Rooms
		for (int i = 0; i < 5; i++) {
			int roomNum = 300 + i;
			roomList.addRoom(roomNum, "triple", 200);
		}
		
		//Creates IncidentalCharges objects
		chargeList.addCharge("water", 2.00); // water charge of $2.00
		chargeList.addCharge("bar", 10.00); // bar charge of $10.00
		chargeList.addCharge("room service", 20.00); // room service charge of $20.00
		
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
					System.out.println("C) Check In/Out N) New Customer A) Room Availability B) Bill D) Daily Reports Q) To Quit");
					String action = in.next().toUpperCase();
						
					// Checking In/Out UI
					if (action.equals("C")) {
						while (!done3) {
							System.out.println("I) Check In O) Check Out Q) Quit");
							String action2 = in.next().toUpperCase();
							
							// Option to check in
							if (action2.equals("I")) {
								System.out.print("Customer ID: ");
								int custID = in.nextInt();
								System.out.print("Room Number: ");
								int roomNum = in.nextInt();
								// Sets the Room to available
								roomList.getRoomByNumber(roomNum).setAvailable(false);
								// Sets the Room Number for the Customer
								custList.getCustomerByID(custID).setRoomNum(roomNum);
								// Sets the Customer ID for the Room
								roomList.getRoomByNumber(roomNum).setCustomerID(custID);
								done3 = true;
							}
							
							// Option to check out
							else if (action2.equals("O")) {
								System.out.print("Customer ID: ");
								int custID = in.nextInt();
								System.out.print("Room Number: ");
								int roomNum = in.nextInt();
								// Sets the Room to unavailable
								roomList.getRoomByNumber(roomNum).setAvailable(true);
								// Sets the Room Number for the Customer
								custList.getCustomerByID(custID).setRoomNum(0);
								// Sets the Customer ID for the Room
								roomList.getRoomByNumber(roomNum).setCustomerID(0);
								done3 = true;
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
							System.out.println("A) All Room Availibility T) Type Room Availablility Q) Quit");
							String action2 = in.next().toUpperCase();
							
							// Option to check room availability of all rooms
							if (action2.equals("A")) {
								roomList.availableAll();
								done3 = true;
							}
							
							// Option to check room availability by type
							else if (action2.equals("T")) {
								System.out.print("Type of room: ");
								String type = in.next();
								roomList.availableByType(type);
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
							System.out.println("P) Print Bill Q) Quit");
							String action2 = in.next().toUpperCase();
							
							// Prints the bill
							if (action2.equals("P")) {
								boolean done4 = false;
								// Ask for customer ID
								System.out.print("Customer ID: ");
								int ID = in.nextInt();
								
								// Ask for numbe of nights stayed
								System.out.print("Number of nights stayed: ");
								int nights = in.nextInt();
								
								// Gets the room number from customer ID
								int roomNum = custList.getCustomerByID(ID).getRoomNum();
								// Gets the price of room from the room number
								double price = roomList.getRoomByNumber(roomNum).getPrice();
								
								// Adds the room expense to bill
								bill.addRoomPrice(price, nights);
								
								// Adding incidental charges to bill
								while (!done4) {
									System.out.println("A) Add Incidental Charge Q) No charges to enter");
									String action3 = in.nextLine().toUpperCase();
									
									// Option to add incidental charges
									if (action3.equals("A")) {
										System.out.print("Name of charge: ");
										String charge = in.next();
										int index = chargeList.findByType(charge);
										in.nextLine();
										if (index >= 0) {
											bill.addIncidentalcharge(chargeList.getChargeByIndex(index).getPrice());
											
										}
										
										// Charge name entered does not exist
										else {
											System.out.println("Sorry, that charge doesn't exist.");
										}
										
									}
									
									// Option to quit adding incidental charges
									else if (action3.equals("Q")) {
										done4 = true;
									}
									
									// Incorrect input
									else {
										System.out.println("Sorry, that was incorrect input.");
									}
								}
								double billTotal = bill.getGrandTotal();
								// Add billTotal to Revenue
								reports.addToRevenue(billTotal);
								System.out.printf("Room Charge          $%3.2f\r\n", bill.getRoomTotal());
								System.out.printf("Incidental Charges   $%3.2f\r\n", bill.getIncidentalChargeTotal());
								System.out.println("------------------------------");
								System.out.printf("Total                $%3.2f\r\n", billTotal);
								
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
					
					// Daily Reports UI
					else if (action.equals("D")) {
						while (!done3) {
							System.out.println("R) Daily Revenue O) Occupancy Rate Q) Quit");
							String action2 = in.next().toUpperCase();
							
							// Daily Revenue Option
							if (action2.equals("R")) {
								
							}
							
							// Occupancy Rate option
							else if (action2.equals("O")) {
								double rate = reports.OccupancyRate(roomList);
								System.out.printf("%.0f%% of rooms are occupied.\n", rate);
								done3 = true;
							}
							
							// Option to quit
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
