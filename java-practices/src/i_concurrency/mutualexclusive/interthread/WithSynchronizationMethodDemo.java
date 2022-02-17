package i_concurrency.mutualexclusive.interthread;

class Table1 {

	synchronized void printTable(int n) { // synchronized method

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

class MyThread21 extends Thread {

	Table1 t;

	MyThread21(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread22 extends Thread {

	Table1 t;

	MyThread22(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(10);
	}
}

public class WithSynchronizationMethodDemo {

	public static void main(String[] args) {

		Table1 obj = new Table1();// only one object

		MyThread21 t1 = new MyThread21(obj);
		MyThread22 t2 = new MyThread22(obj);

		t1.start();
		t2.start();

	}

}
