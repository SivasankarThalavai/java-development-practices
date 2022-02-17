package h_multi_threading;

class TestDaemonThread2 extends Thread {

	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Daemon: " + Thread.currentThread().isDaemon());
	}
}

public class IllegalThreadStateExceptionDemo {

	public static void main(String[] args) {

		TestDaemonThread2 t1 = new TestDaemonThread2();
		TestDaemonThread2 t2 = new TestDaemonThread2();

		t1.start();
		// t1.start();  // will throw exception here
		
		t1.setDaemon(true); // will throw exception here
		t2.start();
	}

}
