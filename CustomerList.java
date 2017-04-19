import java.util.ArrayList;

/**
 * 
 * @author DerekSmith
 *Creation date: 3/23/17
 *
 */

public class CustomerList {
	
	private ArrayList<Customer> mainList;
	private int counter;
	
	public CustomerList() {
		
		mainList = new ArrayList<Customer>();
		counter = 0;
		
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
	 * Gets a Customer object by ID
	 * @param ID the ID of the Customer
	 * @return Customer object with specified ID
	 */
	public Customer getCustomerByID(int ID) {
		int index = ID - 1;
		return mainList.get(index);
		
	}
	
	/**
	 * Gets the desired Customer object
	 * @param index the desired Customer object's index in the ArrayList
	 * @return the Customer object at location index in ArrayList
	 */
	public Customer getCustomer(int index) {
		return mainList.get(index);
		
	}
	
	/**
	 * Finds a customer's index number by last name
	 * @param last customer's last name
	 * @return if >= 0 index location in mainList, if < 0 customer not found
	 */
	public int findByLast(String last) {
		int match = -1;
		for (int i = 0; i < counter && match == -1; i++) {
			if (last.equals(mainList.get(i).getLast())) {
				match = i;
			}
		}
		return match;
	}
	
	/**
	 * Finds a customer's index number by first name
	 * @param first customer's first name
	 * @return if >= 0 index location in mainList, if < 0 customer not found
	 */
	public int findByFirst(String first) {
		int match = -1;
		for (int i = 0; i < counter && match == -1; i++) {
			if (first.equals(mainList.get(i).getFirst())) {
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
	public boolean existingCustomer(String fName, String lName) {
		int first = findByFirst(fName);
		int last = findByLast(lName);
		if (first == last) {
			return true;
		} else {
			return false;
		}
	}

}
