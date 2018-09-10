
public class PlaneSeat implements Comparable<Object>{
	private int seatId;
	private boolean assigned;
	private int customerId;

	public PlaneSeat(int seat_id) {
		seatId = seat_id;
		
	}

	public int getSeatId() {
		return seatId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public boolean isOccupied() {
		return assigned;
	}
	
	public void assign(int cust_id) {
		customerId = cust_id;
		assigned = true;
	}
	
	public void unAssign() {
		assigned = false;
	}
	
	public int compareTo(Object o) {
        if (o instanceof PlaneSeat) {

            PlaneSeat seat = (PlaneSeat) o;
            if (this.getCustomerId() > seat.getCustomerId()) {
                return 1;
            } else if (this.getCustomerId()< seat.getCustomerId()) {
                return -1;
            }
        }
        return 0;
    }

}
