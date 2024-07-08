package sar;

public class Bank {
	static int currentBalance=10000;

	public static void greetCustomer() {
			System.out.println("Hello Customer");
		}
	public void deposit(int amount) {
		currentBalance=amount+currentBalance;
		
	}
public static void withdrawal(int amount) {
	currentBalance=currentBalance-amount;
	}
public int getCurrentBalance() {
	return currentBalance;
	
}
		public static void main(String[] args) {
			greetCustomer();
			Bank b =new Bank();
			b.deposit(2000);
			System.out.println(b.getCurrentBalance());
			withdrawal(1000);
			System.out.println(b.getCurrentBalance());
			
	}

}
