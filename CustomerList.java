import java.util.ArrayList;


public class CustomerList {
	
	private ArrayList<Customer> mainList;
	
	public CustomerList() {
		
		mainList = new ArrayList<Customer>();
		
	}
	
	public void add(String first, String last) {
		
		Customer c1 = new Customer(first, last);
		mainList.add(c1);
		
	}

}
