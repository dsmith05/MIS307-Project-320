/*
 * @author RachelBasala
 */

public class BillingExpense {
	
	private double roomTotal;
	private double chargeTotal;
	private double grandTotal;
	
	
	public BillingExpense() 
	{
		roomTotal = 0;
		chargeTotal = 0;
		grandTotal = 0;
		
	}
	
	/**
	 * Adds the price of the room to total
	 * @param price price of room per night
	 * @param nights number of nights stayed
	 */
	public void addRoomPrice(double price, int nights)
	{
		roomTotal = roomTotal + (price * nights);
		grandTotal = grandTotal + (price * nights);
	}
	
	/**
	 * Adds an incidental charge to the totals
	 * @param charge price of incidental charge
	 */
	public void addIncidentalcharge(double charge)
	{
		chargeTotal = chargeTotal + charge;
		grandTotal = grandTotal + charge;
	}
	
	public double getRoomTotal() {
		return roomTotal;
	}
	
	/**
	 * Gets the total of all incidental charges
	 * @return total of all incidental charges
	 */
	public double getIncidentalChargeTotal()
	{
		return chargeTotal;
	}
	
	/**
	 * Gets the grand total of the stay
	 * @return grand total of all expenses to customer
	 */
	public double getGrandTotal()
	{
		return grandTotal;
	}
	
	
	
	
}
