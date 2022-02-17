package i_concurrency.mutualexclusive.interthread;

class Customer {

	int amount = 10000;

	synchronized void withdraw(int amount) {

		System.out.println("going to withdraw...");

		if (this.amount < amount) {

			System.out.println("Less balance; waiting for deposit...");
			try {

				wait();

				System.out.println("withdraw completed...");

			} catch (Exception e) {
				System.out.println("Something wrong");
			}
		} else {
			this.amount -= amount;
			System.out.println("withdraw completed...");
		}
	}

	synchronized void deposit(int amount) {

		System.out.println("going to deposit...");

		this.amount += amount;
		System.out.println("deposit completed... ");

		notify();
	}
}

public class InterThreadCommunicationDemo {

	public static void main(String args[]) {

		final Customer c = new Customer();

		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();

		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();

	}

}
