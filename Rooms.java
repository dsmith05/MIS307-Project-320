import java.util.ArrayList;

/*
 * list of all rooms, searches for rooms hey 
 * @author afridgen
 */
public class Rooms {

	
	private ArrayList<Rooms> type;
	private int counter;
	private int counterx2;
	private int counterx3;
	private int total;
        private int totalx2;
        private int totalx3;
        private final int single = 40;
        private final int double1 = 30;
        private final int triple = 20;
        
	public Rooms()
	{
	   type = new ArrayList<Rooms>();
           //ArrayList<Double> type = new ArrayList<Double>();
	   
	}
	
	public void addSingle(int single)
	{
                
               
		Rooms x = new Rooms();
                type.add(x);
                double price = 100;
		total += single;
                            
	}
        
	public void addDouble(int double1) {
		Rooms x2 = new Rooms();
		type.add(x2);
		//counterx2++;
                
                totalx2 += double1;
                
	}
	public void addTriple(int triple) {
		Rooms x3 = new Rooms();
		type.add(x3);
		//counterx3++;
                totalx3 += triple;
              
               
	}
	public void removeSingle(int single)
            {
                Rooms x = new Rooms();
		type.remove(x);
		//counter--;
                total -= single;
	}
	public void removeDouble(int double1) {
                Rooms x2 = new Rooms();
		type.remove(x2);
		//counterx2--;
                totalx2 -= double1;
	}
	public void removeTriple(int triple){
                Rooms x3 = new Rooms();
		type.remove(x3);
		//counterx3--;
                totalx3 -= triple;
	}
	public void getRooms() {
             System.out.println("Single " + total);
             System.out.println("Double " + totalx2);
             System.out.println("Triple " + totalx3);
	}
        public void getTotalSingle() {
            System.out.println(total);
           
        }
        public void getToalDouble() {
            System.out.println(totalx2);
        }
        public void getTotalTriple() {
            System.out.println(totalx3);
        }
	}