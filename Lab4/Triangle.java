import java.lang.Math;

public class Triangle extends Shape {
	
	private double height;
	private double base;// radius of circle
	
	public Triangle(double h,double b) {
		// TODO Auto-generated constructor stub
		height = h;
		base = b;
	}

	public double area() {
		// TODO Auto-generated method stub
		return (height * base)/2;
	}

	public double threedarea() {
		// TODO Auto-generated method stub
		return base*base + 2*base*(Math.sqrt((base*base)/4+(height*height)));
		
	}

	public double more3darea() {
		// TODO Auto-generated method stub
		double hbase = base/2;
		double slantheight = Math.sqrt((height*height)+(hbase*hbase));
		return Math.PI*hbase*slantheight + Math.PI*(hbase*hbase);
	}

}
