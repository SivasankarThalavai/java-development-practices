package h_multi_threading;

public class IllegalArgumentException extends Thread {

	public static void main(String argvs[]) {

		Thread.currentThread().setPriority(17);
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

	}
}