package h_multi_threading;

class ThreadNew extends Thread {

	ThreadNew(String tName) {
		super(tName);
		start();
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + " Started.");

		for (int j = 0; j < 1000; j++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				System.out.println("The exception has been encountered " + e);
			}
		}
	}
}

public class StartThreadFromConstructor {

	public static void main(String argvs[]) {

		ThreadNew th1 = new ThreadNew("T1");
		System.out.println("Starting the first");

		ThreadNew th2 = new ThreadNew("T1");
		System.out.println("Starting the second");

	}
}