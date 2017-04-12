/**
 * 
 * @author DerekSmith
 *Creation date: 3/23/17
 *
 */
public class Customer {
	
	private static int counter = 0;
	private int ID;
	private String firstName;
	private String lastName;
	private int roomNum;
	
	public Customer(String first, String last) {
		
		counter++;
		ID = counter;
		firstName = first;
		lastName = last;
		roomNum = 0;
		
		
	}
	
	/**
	 * Changes the roomNum variable to the room parameter
	 * @param room the desired room number change
	 */
	public void setRoomNum(int room) {
		roomNum = room;
		
	}
	
	/**
	 * Gets the customer's first name
	 * @return customer's first name
	 */
	public String getFirst() {
		return firstName;
	}
	
	/**
	 * Gets the customer's last name
	 * @return customer's last name
	 */
	public String getLast() {
		return lastName;
	}
	
	/**
	 * Gets the customer's room number
	 * @return customer's current room number, 0 if no current room
	 */
	public int getRoomNum() {
		return roomNum;
	}
	
	/**
	 * Gets the ID number of a customer
	 * @return Customer's ID number
	 */
	public int getID() {
		return ID;
	}

}
