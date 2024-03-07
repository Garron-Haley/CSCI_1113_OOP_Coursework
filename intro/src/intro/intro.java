package intro;

import java.lang.reflect.*;
import java.util.Scanner;
public class intro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int b = 1111;
		checking check = new checking(50, - 50);
		saving save = new saving(50, false);
		account accountarray = new account(b, (check.balance + save.balance) , 0.045);
		System.out.println(accountarray.toString());
		System.out.println(check.toString());
		System.out.println(save.toString());
	
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
	public String toString() {
		return "account id " + id+ " account balance "+balance+" account interest rate "+ interestrate;
	}
	
} class checking {
	 double balance;
	 double overdraft;
	 checking(){
		 balance = 0;
		 overdraft = 0;
		 
	 }
	 checking(double newbalance, double newdraft){
		 balance = newbalance;
		 overdraft = newdraft;
	 }
	 void setbalance(double newbalance) {
		 balance = newbalance;
	 }
	 void setdraft(double newdraft) {
		 overdraft = newdraft;
	 }
	 public String toString() {
		 return "checking balance " + balance + " overdraft limit " + overdraft;
	 }
 }
 class saving {
	 double balance;
	 boolean overdraft;
	saving(double newbalance, boolean newdraft){
		 balance = newbalance;
		 overdraft = newdraft;
	 }
	 void setbalance(double newbalance) {
		 balance = newbalance;
	 }
	 void setdraft(boolean newdraft) {
		 overdraft = newdraft;
	 }
	 public String toString() {
		 return "savings balance " + balance + " can account be overdawn " + overdraft;
	 }
 }