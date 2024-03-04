import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String user = input.nextLine();
		System.out.println("'"+user+"'"+" is "+user.length()+" characters long");
		System.out.print("There are "+ countLetters(user)+" letters in "+"'"+user+"'");
	}
	public static int countLetters(String s) {
		int lett = 0;
		for (int i = 0; i < s.length(); i++) {
			char L = s.charAt(i);
			if ((L)>='A'&&(L)<='z') {
				lett++;
			}
		}
		return lett;
	}

}
