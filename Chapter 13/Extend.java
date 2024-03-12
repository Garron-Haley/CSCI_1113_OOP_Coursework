import java.util.Scanner;
abstract class GeometricObject {
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
	
	//override toString
	public String toString()
	{
		return "Created on " + dateCreated + "\ncolor: " + color + 
				" and filled: " + filled;
	}
	abstract double getArea();
	abstract double perimeter();
	public interface Colorable {
		abstract void howToColor();
			
		
	}
}
class Triangle extends GeometricObject implements Colorable {
	double side1;
	double side2;
	double side3;
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	void setSide(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	double getArea() {
		 double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	double perimeter() {
		return side1 + side2 + side3;
	}
	public String howToColor() {
		return "with a crayon";
	}
}
public class Extend {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter 3 sides:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		Triangle object = new Triangle(a,b,c);
		System.out.print("enter a color:");
		String d = input.next();
		System.out.print("is it filled");
		boolean e;
		input.nextLine();
		if (input.nextLine().equalsIgnoreCase("yes")) {
			e = true;
		}
		else {
			e = false;
		}
		object.setColor(d);
		object.setFilled(e);
		System.out.println("the area is "+object.getArea()+" the perimeter is "
		+ object.perimeter()+ " the color is " + object.getColor() + " filled status "+ object.isFilled());
		

	}

}
