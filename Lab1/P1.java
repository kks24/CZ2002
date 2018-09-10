import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = null;
		  char choice;

		  while (input == null) {  
		  Scanner in = new Scanner(System.in);  
		    System.out.println("Enter a string");  
		    input = in.nextLine();
		    choice = input.charAt(0);
		    
		    switch (choice) {
		    case 'A':
		    case 'a':
		    	System.out.printf("Action movie fan\n");
		    	input = null;
		    	break;
		    case 'C':
		    case 'c':
		    	System.out.printf("Comedy movie fan\n");
		    	input = null;
		    	break;
		    case 'D':
		    case 'd':
		    	System.out.printf("Drama movie fan\n");
		    	input = null;
		    	break;
		    default:
		    	System.out.printf("Invalid choice\n");
		    	input = null;
		    	break;
		    }
		    
		  }
	}

}
