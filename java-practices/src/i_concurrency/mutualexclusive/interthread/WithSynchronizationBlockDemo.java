package i_concurrency.mutualexclusive.interthread;

class Table2 {

	void printTable(int n) { // not synchronized method

		synchronized (this) { // synchronized block
			
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

class MyThread31 extends Thread {

	Table2 t;

	MyThread31(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread32 extends Thread {

	Table2 t;

	MyThread32(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(10);
	}
}

public class WithSynchronizationBlockDemo {

	public static void main(String[] args) {

		Table2 obj = new Table2();// only one object

		MyThread31 t1 = new MyThread31(obj);
		MyThread32 t2 = new MyThread32(obj);

		t1.start();
		t2.start();

	}

}
