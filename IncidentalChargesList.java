import java.util.ArrayList;

public class IncidentalChargesList {

private ArrayList<IncidentalCharges> charges;
	

	public IncidentalChargesList()
	{
		charges = new ArrayList<IncidentalCharges>();
	}
	public void addCharge(String name, double charge)
	{
		IncidentalCharges C1 = new IncidentalCharges(name,charge);
		charges.add(C1);
		
	}
	public double getPrice()
	{
		
	}
}
