package Thread;

// javapoint

class Bank {
	int balance = 95;

	synchronized void withdraw(int amount) {
		if (this.balance < amount) {
			System.out.println("Not enough balance..Deposit..");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.balance -= amount;
		System.out.println("Thanks");
	}

	synchronized void deposit(int amount) {
		System.out.println("depositing");
		this.balance += amount;
		System.out.println("deposited");
		notify();
	}
}

public class InterThreadCommunicaton {
	public static void main(String args[]) {
		final Bank c = new Bank();
		new Thread() {
			public void run() {
				c.withdraw(100);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10);
			}
		}.start();

	}

}
