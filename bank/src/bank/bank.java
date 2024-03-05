package bank;
import java.lang.reflect.*;
import java.util.Scanner;
public class bank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		account[] accountarray = new account[10];
		int b = 1111;
		for (int i = 0; i < accountarray.length; i++) {
			accountarray[i] = new account(b, 100, 0.045) ;
			b++;
		}
		account obj = new account();
		for (int i =0; i < 1;) {
		System.out.println("enter account id");
		int userid = input.nextInt();
		int t = 0;
		for (t = 0; t < accountarray.length; t++) {
			if (userid == accountarray[t].getid()) {
				break;
			}
		
		}
		if (userid == accountarray[t].getid()) {
		for (int val = 0; val != 4;) {
		
			System.out.println("Enter 1 to view current balance, 2 to withdraw, 3 to deposit,"
					+ " and 4 to exit");
			val = input.nextInt();
			if (val == 1) {
				System.out.println("you current balance is " + accountarray[t].getbalance());
			}
			if (val == 2) {
				System.out.print("enter amount to withdraw");
				accountarray[t].withdraw(input.nextDouble());
			}
			if (val == 3) {
				System.out.print("enter amount to deposit");
				accountarray[t].deposit(input.nextDouble());
			}
			if (val == 4) {
				
			}
			if (val < 1 || val > 4) {
				System.out.println("enter valid number");
			}
			
		}	
		}
		else {
			System.out.println("enter valid input");
		}
		}
	}
}

class account{
	private int id;
	private double balance;
	private double interestrate;
	java.util.Date dateCreated = new java.util.Date();
	
	account(){
		id = 0;
		balance = 0;
		interestrate = 0;
	}
	
	account(int newid, double newbalance, double newrate){
		id = newid;
		balance = newbalance;
		interestrate = newrate;
	
	}
	double getbalance() {
		return balance;
	}
	int getid() {
		return id;
	}
	double getMonthlyInterestRate() {
		return interestrate / 12;
	}
	double getMonthlyInterest() {
		return this.balance * (interestrate / 12);
	}
	public void withdraw(double a) {
		balance = balance - a;
	}
	public void deposit(double a) {
		balance = balance + a;
	}
	public void setid(int newid){
		id = newid;
	}
	public void setrate(double newrate){
		interestrate = newrate;
	}
	public void setbalance(double newbalance){
		balance = newbalance;
	}
	
}