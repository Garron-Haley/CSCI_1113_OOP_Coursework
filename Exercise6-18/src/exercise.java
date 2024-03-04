import java.util.Scanner;
public class exercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password:");
		String pass = input.nextLine();
		boolean valid = isvalid(pass);
		if (valid == true) {
			System.out.print("Valid Password");
		}
		else {
			System.out.print("Invalid Password");
		}
	}
	public static boolean isvalid(String s) {
		int lettnum = 0;
		int num = 0;
		for (int i =0; i <s.length(); i++) {
			char L = s.charAt(i);
			if (((L)>='A'&&(L)<='z')||( L>= '0' && L<='9')) {
				lettnum++;
			}
		}
		for (int i =0; i <s.length(); i++) {
			char L = s.charAt(i);
			if (( L>= '0' && L<='9')) {
				num++;
			}
		}
		if (s.length() >= 8 && lettnum == s.length() && num >= 2) {
			return true;
		}
		else {
			return false;
		}
	}

}
