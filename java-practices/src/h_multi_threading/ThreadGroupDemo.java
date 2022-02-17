package h_multi_threading;

public class ThreadGroupDemo implements Runnable {

	private static ThreadGroup tg1;

	public void run() {

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				System.out.println("Thread Name: " + Thread.currentThread().getName());
				Thread.currentThread().getThreadGroup().interrupt();
				System.out.println("Thread Group interupt: " + tg1.getName());
			}
		}
	}

	public static void main(String[] args) {

		ThreadGroupDemo runnable = new ThreadGroupDemo();

		tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable, "two");
		t2.start();
		Thread t3 = new Thread(tg1, runnable, "three");
		t3.start();

		System.out.println("Thread Group Name: " + tg1.getName());
		// tg1.list();

	}
}