import java.lang.Math;

public class Rectangle extends Shape{
	
	private double width, height, length;

	public Rectangle(double w, double h) {
		// TODO Auto-generated constructor stub
		width  = w;
		height = h;
	}
	
	public Rectangle(double l, double w, double h) {
		// TODO Auto-generated constructor stub
		length = l;
		width  = w;
		height = h;
	}
	

	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	public double threedarea() {
		// TODO Auto-generated method stub
		return 2*length*height + 2*width*height + 2*length*width;
	}

	public double more3darea() {
		// TODO Auto-generated method stub
		double radius = width/2;
		return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
	}

}
