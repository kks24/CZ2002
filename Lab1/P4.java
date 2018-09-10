import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col, height =0 ;
	    int num = 0;
	    
	    Scanner in = new Scanner(System.in);
	    System.out.println("height : ");
	    try {
			height = in.nextInt();
		}
		catch (java.util.InputMismatchException e) {
            System.out.println("Invaild Input!");
        }
	    
	    if (height <= 0) {
	    	System.out.println("Invaild Input!");
	    }

		
		for (row = 0; row<height; row++)
	    {
			if (row%2 == 0) {
				System.out.print("AA");
				for (col = 1; col<=row; col++) {
		        	if (col%2 == 0)
		        		System.out.print("AA");
		        	else
		        		System.out.print("BB");
		        }
			}
	        else {
	        	System.out.print("BB");
	        	for (col = 1; col<=row; col++) {
		        	if (col%2 == 0)
		        		System.out.print("BB");
		        	else
		        		System.out.print("AA");
		        }
	        }
			
	        System.out.println("");


	    }
	}

}
