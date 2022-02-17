package h_multi_threading;

class ABC implements Runnable {
	public void run() {

		try {
			// moving thread t2 to the state timed waiting
			Thread.sleep(100);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println(
				"The state of thread t1 while it invoked the method join() on thread t2 -" + ThreadState.t1.getState());

		try {
			Thread.sleep(200);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

public class ThreadState implements Runnable {

	public static Thread t1;
	public static ThreadState obj;

	public static void main(String argvs[]) {

		// creating an object of the class ThreadState
		obj = new ThreadState();
		t1 = new Thread(obj);

		// thread t1 is spawned
		// The thread t1 is currently in the NEW state.
		System.out.println("The state of thread t1 after spawning it - " + t1.getState());

		// invoking the start() method on
		// the thread t1
		t1.start();

		// thread t1 is moved to the Runnable state
		System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
	}

	public void run() {

		ABC myObj = new ABC();
		Thread t2 = new Thread(myObj);

		for (int i = 0; i < 5; i++) {

			if (i == 3) {
				t1.interrupt();
				System.out.println("*****************************************");
				System.out.println("T1 calling this when i==3 Thread.interrupt()");
				System.out.println("*****************************************");

			}
			if (Thread.interrupted()) {
				System.out.println("This thread was interruped by someone calling this Thread.interrupt()");
				System.out.println("Cancelling task running in thread " + Thread.currentThread().getName());
				System.out.println(
						"After Thread.interrupted() call, JVM reset the interrupted value to: " + Thread.interrupted());
				// break;
				System.out.println("*****************************************");
			}
		}

		// thread t2 is created and is currently in the NEW state.
		System.out.println("The state of thread t2 after spawning it - " + t2.getState());
		t2.start();

		// thread t2 is moved to the runnable state
		System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());

		// try-catch block for the smooth flow of the program
		try {
			// moving the thread t1 to the state timed waiting
			Thread.sleep(200);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("The state of thread t2 after invoking the method sleep() on it - " + t2.getState());

		// try-catch block for the smooth flow of the program
		try {
			// waiting for thread t2 to complete its execution
			t2.join();
			System.out.println("inside join");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());
		System.out.println("The state of thread t1 when it has completed it's execution - " + t1.getState());

	}

}