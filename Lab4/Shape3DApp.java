import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp {

	public Shape3DApp() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter Number Of Shapes: ");
        choice = sc.nextInt();
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        int schoice = 0;
        
        for (int i=0; i<choice; i++) {
        	System.out.println("Select Shape: ");
        	System.out.println("1. Sphere");
        	System.out.println("2. Cubiod");
        	System.out.println("3. Square Pyramid");
        	System.out.println("4. Cube");
        	System.out.println("5. Cone Pyramid");
        	System.out.println("6. Cylinder");
        	schoice = sc.nextInt();
        	
        	switch (schoice) {
        	case 1:
        		System.out.println("Enter Radius:");
            	double radius = sc.nextDouble();
        		shapes.add(new Circle(radius));
        		break;
	        case 2:
	        	System.out.println("Enter Length:");
	        	double length = sc.nextDouble();
	    		System.out.println("Enter Width:");
	        	double width = sc.nextDouble();
	        	System.out.println("Enter Height:");
	        	double rheight = sc.nextDouble();
	    		shapes.add(new Rectangle(length, width, rheight));
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
        	
	        case 5:
	        	System.out.println("Enter Height:");
	        	double cheight = sc.nextDouble();
	        	System.out.println("Enter Base:");
	        	double cbase = sc.nextDouble();
	    		shapes.add(new Triangle(cheight, cbase));
	    		break;
        	
	        case 6:
	    		System.out.println("Enter Width:");
	        	double cwidth = sc.nextDouble();
	        	System.out.println("Enter Height:");
	        	double crheight = sc.nextDouble();
	    		shapes.add(new Rectangle(cwidth, crheight));
	    		break;
        	
        	}
        	
    	}
        
        System.out.println("Select Type of Calculations:");
        System.out.println("1. Surface Area	");
        choice = sc.nextInt();
        switch (choice) {
    	case 1:
    		double totalArea = 0;
    		for (int i=0; i<shapes.size(); i++) {
    			if (schoice <= 4)
    			totalArea += shapes.get(i).threedarea();
    			else if (schoice >= 5)
    			totalArea += shapes.get(i).more3darea();
    		}
    		System.out.println("Total Surface Area: " + totalArea);
    		break;
    	case 2:
    		
        }
        
        

	}

}
