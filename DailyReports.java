/**
 * 
 * @author Andrew Strand
 *Creation date: 4/5/17
 *
 */
import java.util.Scanner;

public class DailyReports{
	
	private double revenue = 0;
	
	public void addToRevenue(double price) {
		revenue = revenue + price;
	}

	/**Scans the ArrayList for the revenue for the day
	 *adds the cost of each unavailable room.
	 *prints the total
	 */
	public double getDailyRevenue() {

		return revenue;
	
	}

	/**calculates the occupancy rate for the day
	 *takes the number of available room and divides it by the total number of rooms.
	 */ 
	public double OccupancyRate(RoomsList list){
		int available = list.countOccupied();
		double percent = available * 100 / 20;
		return percent;
	}

	/**Gets and prints a list of the rooms with the status of needs cleaning.
	 */
	public double getUncleanRoomList(){
		
		return 0;
	}
}