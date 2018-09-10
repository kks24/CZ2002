
public class Square extends Shape{
	private double height;
	
	public Square(double h) {
		// TODO Auto-generated constructor stub
		height = h;
	}

	public double area() {
		// TODO Auto-generated method stub
		return height * height;
	}

	public double threedarea() {
		// TODO Auto-generated method stub
		return 6* (height * height);
	}

	public double more3darea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
