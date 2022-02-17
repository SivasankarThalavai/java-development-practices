package i_concurrency.mutualexclusive.interthread;

class Table4 {

	synchronized static void printTable(int n) { // method not synchronized

		{
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
}

class MyThread41 extends Thread {

	Table4 t;

	public void run() {
		t.printTable(5);
	}

}

class MyThread42 extends Thread {

	Table4 t;

	public void run() {
		t.printTable(10);
	}
}

public class WithStaticSynchronizationDemo {

	public static void main(String[] args) {

		MyThread41 t1 = new MyThread41();
		MyThread42 t2 = new MyThread42();

		t1.start();
		t2.start();
	}

}
