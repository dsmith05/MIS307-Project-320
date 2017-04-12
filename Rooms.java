
public class Rooms {

	private int roomNumber;
	private String roomType;
	private double roomPrice;
	private int customerID;
	private boolean available;
	
	public Rooms(int number, String type, double price) {
		
		roomNumber = number;
		roomType = type;
		roomPrice = price;
		customerID = 0;
		available = true;
		
	}
	
	/**
	 * Sets the customer ID for a room
	 * @param ID the ID number of the customer
	 */
	public void setCustomerID(int ID) {
		customerID = ID;
		
	}
	
	/*
	 * Sets available to true or false
	 */
	public void setAvailable(boolean value) {
		available = value;
		
	}
	
	/**
	 * Gets the objects room number
	 * @return int object's room number
	 */
	public int getRoomNumber() {
		return roomNumber;
		
	}
	
	/**
	 * Gets the object's room type
	 * @return String room type
	 */
	public String getType() {
		return roomType;
		
	}
	
	/**
	 * Gets the object's room price
	 * @return Double room price
	 */
	public double getPrice() {
		return roomPrice;
		
	}
	
	/**
	 * Gets the object's availability
	 * @return true if available, false if unavailable
	 */
	public boolean getAvailable() {
		return available;
	}
	
}
