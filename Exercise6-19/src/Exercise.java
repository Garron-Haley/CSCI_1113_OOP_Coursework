import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	System.out.print("Enter the length of the 3 sides of the triangle:");
	double side1 = input.nextDouble();
	double side2 = input.nextDouble();
	double side3 = input.nextDouble();
	boolean ans = isValid(side1 , side2, side3);
	if ( ans == true) {
		System.out.println("Side 1: "+ side1);
		System.out.println("Side 2: "+ side2);
		System.out.println("Side 3: "+ side3);
		System.out.printf("area: %3.1f", area(side1, side2, side3));
	}
	if (ans == false) {
		System.out.println("that is not a valid triangle");
	}
	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static double area(double side1, double side2, double side3) {
		double S = (side1 + side2 + side3) / 2;
		double area = Math.sqrt((S)*(S - side1)*(S - side2)*(S - side3));
		return area;
	}

}
