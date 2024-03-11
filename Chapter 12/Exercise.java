import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class Exercise {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = 100;
		int[] U = new int[n];
		String[] T = new String[n];
		for(int i = 0;i < n; i++) {
			U[i] = (int)(Math.random() * 100);
		}
		
		File myObj = new File("Exercise12-15.txt");
		try {
		  
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		for (int i = 0; i < n; i++) {
			T[i] = String.valueOf(U[i]);
		}
		try {
			FileWriter mywrite = new FileWriter(myObj);
			for(int i = 0;i < n; i++) {
				mywrite.write(T[i]);
				mywrite.write(" ");
			}
			
			mywrite.close();
			System.out.println("successfully wrote to file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader (new FileReader(myObj));
		List<String> number = new ArrayList<String>();
		String line;
		while ((line = br.readLine()) != null) {
			number.add(line);
		}
		br.close();
		for (String name : number) {
			System.out.println(name);
		}
		
			
	}

}
