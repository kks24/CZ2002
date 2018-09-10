import java.util.Scanner;

public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int choice;
        Plane p = new Plane();
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
			
		do {
			System.out.println("\nEnter the number of your choice: ");
			choice = sc.nextInt();
			
			
            switch (choice) {

                case 1:
                	p.showNumEmptySeats();
                    break;
                case 2:
                    p.showEmptySeats();
                    break;
                case 3:
                    p.showAssignedSeats(true);
                    break;
                case 4:
                    p.showAssignedSeats(false);
                    break;
                case 5:
                	System.out.println("Assigning Seat ..");
                	System.out.println("Please enter SeatID: ");
                	int seatID = sc.nextInt();
                	System.out.println("Please enter Customer ID: ");
                	int custID = sc.nextInt();
                    p.assignSeat(custID, seatID);
                    break;
                case 6:
                	System.out.println("Unassigning Seat ..");
                    System.out.println("Please Enter Seat ID: ");
                    int seatId = sc.nextInt();
                    p.unAssignSeat(seatId);
                    break;
                case 7:
                    break;
            }
        } while (choice > 0 && choice != 7);

	}

}
