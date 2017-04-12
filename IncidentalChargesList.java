import java.util.ArrayList;

public class IncidentalChargesList {

	private ArrayList<IncidentalCharges> charges;
	private int counter;

	public IncidentalChargesList()
	{
		charges = new ArrayList<IncidentalCharges>();
	}
	
	/**
	 * Creates a new IncidentalCharges object and adds it to ArrayList
	 * @param type the type of charge
	 * @param price the price of charge
	 */
	public void addCharge(String type, double price) {
		IncidentalCharges charge = new IncidentalCharges(type, price);
		charges.add(charge);
		counter++;
		
	}
	
	/**
	 * gets the IncidentalCharges object by type
	 * @param type the type of charge
	 * @return the object that has specified type
	 */
	public IncidentalCharges getCharge(String type) {
		int index = findByType(type);
		return charges.get(index);
		
	}
	
	public int findByType(String type) {
		int match = -1;
		for (int i = 0; i < counter && match == -1; i++) {
			if (charges.get(i).equals(type)) {
				match = i;
			}
		}
		return match;
	}
}
