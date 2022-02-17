package h_multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread21 implements Runnable {

	private String message;

	public WorkerThread21(String s) {
		this.message = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		System.out.println(Thread.currentThread().getName() + " (End)");// prints thread name
	}
}

public class ThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);// creating a pool of 5 threads

		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread21("" + i);
			executor.execute(worker);// calling execute method of ExecutorService
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");

	}

}
