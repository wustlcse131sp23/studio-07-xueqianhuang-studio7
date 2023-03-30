package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double initlength, double initwidth) {
		length = initlength;
		width = initwidth;
	}
	
	public double area() {
		double area = length * width;
		return area;
	}
	
	public double parameter() {
		double parameter = 2.0 * (length + width);
		return parameter;
	}
	
	public boolean isSmallerThan(Rectangle b) {
		if(a.area() < b.area())
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(10.2 , 5.3);
		Rectangle b = new Rectangle(11.5 , 4.7);
		
		boolean smaller = a.isSmallerThan(a,b);
		System.out.println(a.area());
		System.out.println(b.area());
		System.out.println(a.isSmallerThan(a,b));
	}

}
