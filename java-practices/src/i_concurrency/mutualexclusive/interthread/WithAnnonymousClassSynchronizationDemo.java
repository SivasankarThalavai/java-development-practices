package i_concurrency.mutualexclusive.interthread;

class Table5 {

	synchronized static void printTable(int n) {
		
		for (int i = 1; i <= 5; i++) {

			System.out.println(n + " * " + i + " = " + n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class WithAnnonymousClassSynchronizationDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			public void run() {
				Table5.printTable(1);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				Table5.printTable(10);
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				Table5.printTable(100);
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				Table5.printTable(1000);
			}
		};

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
