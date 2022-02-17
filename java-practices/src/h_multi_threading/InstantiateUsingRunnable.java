package h_multi_threading;

class WorkerThread implements Runnable {

	private String data;

	public WorkerThread(final String anyData) {
		this.data = anyData;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] [data=" + this.data + "] Message " + i);
			try {
				Thread.sleep(200);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class InstantiateUsingRunnable {

	public static void main(String[] args) {

		System.out.println("Thread main started");

		final Thread thread1 = new Thread(new WorkerThread("Process data through Runnable interface"));
		thread1.start();
		thread1.setName("Demo Thread");

		System.out.println("Thread main finished");
	}

}
