
public class Circle extends Shape {
	
	private double radius; // radius of circle
	private static final double PI = 3.14159;

	public Circle(double r) {
		// TODO Auto-generated constructor stub
		radius = r;
	}

	public double area() {
		// TODO Auto-generated method stub
		return PI * (radius * radius);
	}

	public double threedarea() {
		// TODO Auto-generated method stub
		return 4 * PI * (radius * radius);
	}

	public double more3darea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
