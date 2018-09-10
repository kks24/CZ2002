import java.util.ArrayList;
import java.util.Scanner;

public class Shape2DApp {

	public Shape2DApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter Number Of Shapes: ");
        choice = sc.nextInt();
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        for (int i=0; i<choice; i++) {
        	System.out.println("Select Shape: ");
        	System.out.println("1. Circle");
        	System.out.println("2. Rectangle");
        	System.out.println("3. Triangle");
        	System.out.println("4. Square");
        	int schoice = sc.nextInt();
        	
        	switch (schoice) {
        	case 1:
        		System.out.println("Enter Radius:");
            	double radius = sc.nextDouble();
        		shapes.add(new Circle(radius));
        		break;
	        case 2:
	    		System.out.println("Enter Width:");
	        	double width = sc.nextDouble();
	        	System.out.println("Enter Height:");
	        	double rheight = sc.nextDouble();
	    		shapes.add(new Rectangle(width, rheight));
	    		break;
	    		
	        case 3:
	    		System.out.println("Enter Height:");
	        	double theight = sc.nextDouble();
	        	System.out.println("Enter Base:");
	        	double base = sc.nextDouble();
	    		shapes.add(new Triangle(theight, base));
	    		break;
	    		
	        case 4:
	        	System.out.println("Enter Height:");
	        	double sheight = sc.nextDouble();
	    		shapes.add(new Square(sheight));
	    		break;
        	
        	}
    	}
        
        System.out.println("Select Type of Calculations:");
        System.out.println("1. Area");
        choice = sc.nextInt();
        switch (choice) {
    	case 1:
    		double totalArea = 0;
    		for (int i=0; i<shapes.size(); i++) {
    			totalArea += shapes.get(i).area();
    		}
    		System.out.println("Total Area: " + totalArea);
    		break;
    	case 2:
    		
        }
        
        

	}

}
