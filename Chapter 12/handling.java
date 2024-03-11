package handling;
import java.io.IOException;
import java.util.Scanner;
public class handling {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		int n = 100;
		int[] numarr = new int[n];
		for (int i = 0; i < n; i++) {
			numarr[i] = (int)(Math.random() * 100);
		}
		System.out.println("enter index number");
		int U = input.nextInt();
		try {
			int result = numarr[U];
			System.out.println("index "+U+" is "+result);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
		
	}
}
