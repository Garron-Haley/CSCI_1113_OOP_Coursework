import java.lang.reflect.*;
public class bank {

	public static void main(String[] args) {
		account myaccount = new account(1122, 20000, 0.045);
		myaccount.withdraw(2500);
		myaccount.deposit(3000);
		account obj = new account();
		System.out.println("balance is " + myaccount.getbalance() + " monthly interest is " +
		myaccount.getMonthlyInterest() + " date created " + myaccount.dateCreated.toString());
		
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