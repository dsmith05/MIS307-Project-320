import java.util.ArrayList;

/**
 * 
 * @author DerekSmith
 *Creation date: 3/23/17
 */

public class CustomerList {
	
	private ArrayList<Customer> mainList;
	private int counter = 0;
	
	public CustomerList() {
		
		mainList = new ArrayList<Customer>();
		
	}
	/**
	 * Creates a new customer object
	 * @param first customer's first name
	 * @param last customer's last name
	 */
	public void add(String first, String last) {
		Customer c1 = new Customer(first, last);
		mainList.add(c1);
		counter++;
		
	}
	
	/**
	 * Finds a customer's index number by last name
	 * @param last customer's last name
	 * @return if >= 0 index location in mainList, if < 0 customer not found
	 */
	public int findByName(String last) {
		int match = -1;
		for (int i = 0; i < counter && match == 0; i++) {
			if (last.equals(mainList.get(i).getLast())) {
				match = i;
			}
		}
		return match;
	}
	
	/**
	 * Finds a cusotmer's index number by room number
	 * @param room room number 
	 * @return
	 */
	public int findByRoom(int room) {
		int match = 0;
		for (int i = 0; i < counter && match == 0; i++) {
			if (room == mainList.get(i).getRoomNum()) {
				match = i;
			}
		}
		return match;	
	}
	
	/**
	 * Checks if a customer object already exists
	 * @param fName First name of customer
	 * @param lName Last name of customer
	 * @return if true, customer already exists/ if false, customer does not exist
	 */
	public boolean existingCust(String fName, String lName) {
		return false;
		
	}

}
