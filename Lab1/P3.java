import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int starting = 0;
		int ending = 0;
		int increment = 0;
		double sgd = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Starting : ");
		try {
			starting = in.nextInt();
		}
		catch (java.util.InputMismatchException e) {
            System.out.println("Invaild Input!");
        }
		
		System.out.print("Ending : ");
		try {
			ending = in.nextInt();
		}
		catch (java.util.InputMismatchException e) {
            System.out.println("Invaild Input!");
        }
		System.out.print("Increment : ");
		try {
			increment = in.nextInt();
		}
		catch (java.util.InputMismatchException e) {
            System.out.println("Invaild Input!");
        }
		
		if (ending < starting) {
			System.out.println("Invaild Input!");
		}
		else {
			System.out.println("US$         S$");
			System.out.println("--------------");
			
			for (int i = starting; i<=ending; i+=increment) {
				double usdrate = 1.82;
				sgd = i*usdrate;
				System.out.println(i + "           " + sgd);
				
			}
			
			System.out.println("US$         S$");
			System.out.println("--------------");
			
			int s= starting;
			while(s<=ending) {
				double usdrate = 1.82;
				sgd = s*usdrate;
				System.out.println(s + "           " + sgd);
				s+=increment;
			}
			
			System.out.println("US$         S$");
			System.out.println("--------------");
			
			int s2= starting;
			do {
				double usdrate = 1.82;
				sgd = s2*usdrate;
				System.out.println(s2 + "           " + sgd);
				s2+=increment;
			} while(s2<=ending);
		}
	}

}
