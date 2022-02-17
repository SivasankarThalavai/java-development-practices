package h_multi_threading;

public class ThreadInterruptDemo implements Runnable {

	public static Thread t1;

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] Message " + i);

			if(i == 3) {
				t1.interrupt();
			}
			
			if (Thread.interrupted()) {
				System.out.println("This thread was interruped by someone calling this Thread.interrupt()");
				System.out.println("Cancelling task running in thread " + Thread.currentThread().getName());
				System.out.println(
						"After Thread.interrupted() call, JVM reset the interrupted value to: " + Thread.interrupted());
				// break;
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Thread main started");

		t1 = new Thread();
		t1.setName("Thread1");
		t1.start();
		t1.run();

		System.out.println("Thread main finished");

	}

}
