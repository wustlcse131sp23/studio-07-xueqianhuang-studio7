package studio7;

import edu.princeton.cs.introcs.StdDraw;
public class Rectangle {
	
	private String name;
	private double length;
	private double width;
	
	/*** 
	 * 
	 * @param initname the name of the Rectangle
	 * @param initlength the length of the Rectangle
	 * @param initwidth the width of the Rectangle
	 */
	public Rectangle(String initname, double initlength, double initwidth) {
		name = initname;
		length = initlength;
		width = initwidth;
	}
	/***
	 * 
	 * @return the area of current length and width
	 */
	public double area() {
		double area = length * width;
		return area;
	}
	/***
	 * 
	 * @return the parameter of current length and width
	 */
	public double parameter() {
		double parameter = 2.0 * (length + width);
		return parameter;
	}
	/***
	 * 
	 * @return String
	 */
	public String toStirng() {
		return name;
	}
	/***
	 * 
	 * @param b is a rectangle you want to compare with
	 * @return if it is larger than 
	 */
	public boolean isSmallerThan(Rectangle b) {
		if((length * width) < b.area()) {
			System.out.println(name+ " is smaller than b.");
			return true;
		}
			
		else {
			System.out.println(name +" is larger than b.");
			return false;
		}
	}
	
	public boolean isSquare() {
		if(length == width) {
			System.out.println("Rectangle is a square.");
			return true;
		}
			
		else
			return false;
	}
	
	public void drawRectangle() {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(0.5 ,0.5 , width, length);
		StdDraw.show();
	}
	
	public static void main(String[] args) {
		
		Rectangle a = new Rectangle("a" , 0.102 , 0.102);
		Rectangle b = new Rectangle("b", 0.115 , 0.057);

		System.out.println(a.area());
		System.out.println(b.area());
		a.isSmallerThan(b);
		a.isSquare();
		b.isSquare();
		a.drawRectangle();
		b.drawRectangle();
		
	}

}
