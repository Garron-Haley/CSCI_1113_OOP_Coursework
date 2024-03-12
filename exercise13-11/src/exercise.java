
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
}
class Octagon extends GeometricObject 
	implements Cloneable, Comparable<Octagon> {
		@Override
		public int compareTo(Octagon o) {
			if (getArea() > o.getArea())
				return 1;
			else if (getArea() < o.getArea())
				return -1;
			else 
				return 0;
		}
		double side;
		public Octagon(double side) {
			this.side = side;
		}
		double getside() {
			return side;
		}
		void setside(double side) {
			this.side = side; 
		}
		public double getArea() {
			return ((2 + (4 / (Math.sqrt(2)))) * side * side);
		}
		
		public Object clone() {
			try {
				return super.clone();
			}
			catch (CloneNotSupportedException ex) {
				return null;
			}
		}
		
}

public class exercise {

	public static void main(String[] args) {
		Octagon object = new Octagon(5);
		Octagon object2 = (Octagon)object.clone();
		System.out.print(object.compareTo(object2));
		
	}

}
