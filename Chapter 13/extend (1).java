package extend;
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
	 public void howToColor() {
		System.out.println("Color all three sides");
	}
}
public class extend {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GeometricObject[] object = new GeometricObject[5];
		for (int i = 0; i < 5; i++) {
			object[i] = new Triangle(3,4,5);
			if (i % 2 == 0) {
				object[i].setColor("orange");
				object[i].setFilled(true);
			}
			if (i % 2 != 0) {
				object[i].setColor("purple");
				object[i].setFilled(false);
			}
		
		}
		for(int i = 0; i < 5; i++) {
			if (object[i] instanceof Colorable) {
				System.out.print("the area is "+object[i].getArea()+" how to color: ");
				((Colorable)object[i]).howToColor();
			}
		}
	}

}