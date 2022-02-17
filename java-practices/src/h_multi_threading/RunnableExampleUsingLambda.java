package h_multi_threading;

public class RunnableExampleUsingLambda {

	public static void main(final String[] args) {
		
		System.out.println(" main thread started : " + Thread.currentThread().getName());

		System.out.println("Creating Runnable...");

		final Runnable runnable = () ->  { 
			
			// run method content
			System.out.println("Inside  : " + Thread.currentThread().getName());
			
		};

		System.out.println("Creating Thread...");
		final Thread thread = new Thread(runnable);

		System.out.println("Starting Thread...");
		thread.start();

		System.out.println(" main thread ended : " + Thread.currentThread().getName());
	}
}