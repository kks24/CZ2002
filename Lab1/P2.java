import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 0.0;
		int merit = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Salary : ");
		try {
			salary = in.nextDouble();
		}
		catch (java.util.InputMismatchException e) {
            System.out.println("Invaild Input!");
        }
		
		System.out.print("Merit : ");
		try {
			merit = in.nextInt();
		}
		catch (java.util.InputMismatchException e) {
            System.out.println("Invaild Input!");
        }
		
		if (salary>799 || (salary >=700 && merit >= 20))
	     {
			System.out.println("Grade A");
	     }

	     else if (salary>649 || (salary >= 600 && merit >= 10))
	     {
	    	 System.out.println("Grade B");
	     }

	     else if (salary >= 500)
	     {
	    	 System.out.println("Grade C");
	     }
		

	}

}
