import java.util.ArrayList;

/*
 * @author RachelBasala
 */
public class IncidentalCharges {
	
	private String type;
	private double price;
	
	public IncidentalCharges(String t, double p) {
		type = t;
		price = p;
		
	}
	
	/**
	 * Gets the type of incidental charge
	 * @return String type of charge
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Gets the price of incidental charge
	 * @return double price of charge
	 */
	public double getPrice() {
		return price;
	}
	
}
