package h_multi_threading;

public class CreateThreadUsingThreadClass extends Thread {

	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {

		CreateThreadUsingThreadClass t1 = new CreateThreadUsingThreadClass();
		t1.start();
		
		Thread t2 = new Thread("My first thread"); 
		t2.start();

	}

}
