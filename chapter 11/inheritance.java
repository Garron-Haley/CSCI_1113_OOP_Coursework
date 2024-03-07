package inheritance;
import java.util.Scanner;

import inheritance.GeometricObject.Triangle;
public class inheritance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of a triangle");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		System.out.println("enter a color");
		String d = input.next();
		System.out.println("Is the shape filled (yes/no)");
		String e = input.next();
		boolean f;
		if (e.equalsIgnoreCase("yes")) {
			f = true;
		}
		else {
			f = false;
		}
		GeometricObject user2 = new GeometricObject(d,f);
		Triangle user = user2.new Triangle(a,b,c);
		
		System.out.print("area is = " + user.getArea()+" perimeter is = "+ user.getPerimeter()+" "+
		user2.toString());
	}

}
 class GeometricObject {
	//date fields
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//constructors
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	//getter
	public String getColor()
	{
		return color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	//setter
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	
	public String toString()
	{
		return "Created on " + dateCreated + "\ncolor: " + color + 
				" and filled: " + filled;
	}
class Triangle extends GeometricObject{
	double side1;
	double side2;
	double side3;
	double s = (side1 + side2 + side3) / 2;
	Triangle(){
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	Triangle(double new1, double new2, double new3){
		side1 = new1;
		side2 = new2;
		side3 = new3;
	}
	double getPerimeter() {
		return side1 + side2 + side3;
	}
	double getArea() {
		return Math.sqrt((side1 + side2 + side3) /  2);
	}
	public String toString() {
		return "Triangle: side1 ="+side1+"side2 ="+side2+"side3 ="+side3;
	}
	void setside1(double new1) {
		side1 = new1;
	}
	void setside2(double new2) {
		side2 = new2;
	}
	void setside3(double new3) {
		side3 = new3;
	}
}
}
