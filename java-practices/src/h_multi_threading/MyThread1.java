package h_multi_threading;

class Thread3 extends Thread {

	Thread3(String name) {
		super(name);
		start();
	}

	public void run() {

		System.out.println("Starting the first thread run method ");

		for (int j = 0; j < 1000; j++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				System.out.println("The exception has been encountered " + e);
			}
		}
	}

}

public class MyThread1 {

	public static void main(String argvs[]) {

		Thread t1 = new Thread("T1");
		System.out.println("first thread started");

	}
}