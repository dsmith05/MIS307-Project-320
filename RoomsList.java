import java.util.ArrayList;

public class RoomsList {
	
	private ArrayList <Rooms> roomsList;
	private int counter;
	
	public RoomsList() {
		
		roomsList = new ArrayList<Rooms>();
		counter = 0;
		
	}
	
	/**
	 * Adds a new room object to the array list
	 * @param roomNum Room number of new room
	 * @param type Type of new room
	 * @param price Price of new room
	 */
	public void addRoom(int roomNum, String type, double price) {
		Rooms room = new Rooms(roomNum, type, price);
		roomsList.add(room);
		counter++;
		
	}
	
	/**
	 * Gets a room object at the specified index
	 * @param index index in ArrayList
	 * @return Rooms object at index
	 */
	public Rooms getRoom(int index) {
		return roomsList.get(index);
	}
	
	/**
	 * Gets a Rooms object by specified room number
	 * @param roomNum the room number for the object
	 * @return the Rooms object with specified room number
	 */
	public Rooms getRoomByNumber(int roomNum) {
		int index = findByRoomNumber(roomNum);
		return roomsList.get(index);
		
	}
	
	/**
	 * Finds the index location of a room object by room number
	 * @param roomNum Desired room number
	 * @return int index location of object
	 */
	public int findByRoomNumber(int roomNum) {
		int match = -1;
		for (int i = 0; i < counter && match == -1; i++) {
			if (roomNum == roomsList.get(i).getRoomNumber()) {
				match = i;
			}
		}
		return match;
		
	}
	
	public int countOccupied() {
		int count = 0;
		for (int i = 0; i < counter; i++) {
			if (!getRoom(i).getAvailable()) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Checks and prints all available rooms
	 */
	public void availableAll() {
		for (int i = 0; i < counter; i++) {
			if (getRoom(i).getAvailable()) {
				System.out.println(getRoom(i).getRoomNumber());
			}
		}
	}
	
	/**
	 * Checks and prints the available rooms by specified type
	 * @param type the type of room to be searched
	 */
	public void availableByType(String type) {
		for (int i = 0; i < counter; i++) {
			// Checks to match the type of room
			if (getRoom(i).getType().equals(type)) {
				// Checks if room is available
				if (getRoom(i).getAvailable()) {
					System.out.println(getRoom(i).getRoomNumber());
				}
			}
		}
		
		
	}

}
