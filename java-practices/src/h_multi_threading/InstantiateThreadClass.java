package h_multi_threading;

class WorkerThread1 extends Thread {

	private String anyData;

	public WorkerThread1(final String anyData) {
		this.anyData = anyData;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(
					"[" + Thread.currentThread().getName() + "] " + "[data=" + this.anyData + "] Message " + i);
			try {
				Thread.sleep(200);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class InstantiateThreadClass {

	public static void main(String[] args) {

		System.out.println("Thread main started");

		final Thread thread1 = new Thread(new WorkerThread1("Thread 1 content "));
		thread1.setName("WorkerThread 1");

		final Thread thread2 = new Thread(new WorkerThread1("Thread 2 content "));
		thread2.setName("WorkerThread 2");

		thread1.start();
		thread2.start();

		System.out.println("Thread main finished");

	}

}
