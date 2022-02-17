package h_multi_threading;

class ThreadNew1 extends Thread {

	ThreadNew1(String tName, ThreadGroup tgrp) {
		super(tgrp, tName);
		start();
	}

	public void run() {

		for (int j = 0; j < 1000; j++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				System.out.println("The exception has been encountered " + e);
			}
		}
	}
}

public class ActiveCountExample {

	public static void main(String argvs[]) {

		ThreadGroup tg = new ThreadGroup("The parent group of threads");

		ThreadNew1 th1 = new ThreadNew1("first", tg);
		System.out.println("Starting the first");

		ThreadNew1 th2 = new ThreadNew1("second", tg);
		System.out.println("Starting the second");

		System.out.println("The total number of active threads are: " + tg.activeCount());
	}
}