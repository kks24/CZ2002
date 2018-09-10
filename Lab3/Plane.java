import java.util.Arrays;

public class Plane {
	
	private PlaneSeat[] seat;
	private PlaneSeat[] sortSeatID;
	private int numEmptySeat;
	private static int NUM_OF_SEATS = 12;

	public Plane() {
		// TODO Auto-generated constructor stub
		//super();
		seat = new PlaneSeat[NUM_OF_SEATS];
        numEmptySeat = NUM_OF_SEATS;
        
        for (int i=0; i<seat.length; i++) {
        	seat[i] = new PlaneSeat(i + 1);
        }
	}
	
	private PlaneSeat[] sortSeats() {
		sortSeatID = new PlaneSeat[NUM_OF_SEATS];
		for(int i=0; i<seat.length; i++) {
			sortSeatID[i] = seat[i];
		}
		Arrays.sort(sortSeatID);
		
		return sortSeatID;
		
	}
	
	public void showNumEmptySeats() {
		System.out.println("There are " + numEmptySeat + " empty seats.");
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty: ");
		
		for(int i=0; i<seat.length; i++) {
			if(!seat[i].isOccupied()) {
				System.out.println("SeatID " + seat[i].getSeatId());
			}
		}
		
	}
	
	public void showAssignedSeats(boolean bySeatId) {
		
		System.out.println("Seat assignments: ");
		
		if (bySeatId) {
			for(int i=0; i<seat.length; i++) {
				if(seat[i].isOccupied()) {
					System.out.println("SeatID " + seat[i].getSeatId() + " assigned to CustomerID " + seat[i].getCustomerId());
				}
			}
		}
		else {
			sortSeats();
			for(int i=0; i<sortSeatID.length; i++) {
				if(sortSeatID[i].isOccupied()) {
					System.out.println("SeatID " + sortSeatID[i].getSeatId() + " assigned to CustomerID " + sortSeatID[i].getCustomerId());
				}
			}
		}
		
	}
	
	public void assignSeat(int cust_id, int seatId) {
		for(int i=0; i<seat.length; i++) {
			
			if(seat[i].getSeatId() == seatId) {
				
				if (seat[i].isOccupied()) {
					System.out.println("Seat already assigned to a customer.");
				}
				else {
					seat[i].assign(cust_id);
					numEmptySeat--;
					System.out.println("Seat Assigned!");
				}
			}
		}
		
	}
	
	public void unAssignSeat(int seatId) {
		for (int i = 0; i < seat.length; i++) {
            if (seat[i].getSeatId() == seatId) {

                if (seat[i].isOccupied()) {

                    seat[i].unAssign();
                    numEmptySeat++;
                    System.out.println("Seat Unassigned!");

                } 
                else {
                    System.out.println("Seat not occupied.");
                }
            }
		}

	}
	


}
