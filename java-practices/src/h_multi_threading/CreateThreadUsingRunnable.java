package h_multi_threading;

// Multithreading means doing things simultaneously, in parallel. In Java, concurrency is done with threads. 

// Threads are units of code that can be executed at the same time.

// threads use a shared memory area. They don't allocate separate memory area so saves memory

// context-switching between the threads takes less time than process

// They are sometimes called lightweight processes, although, in fact, a thread is executed within a process (and every process has, at least, one thread, the main thread).

public class CreateThreadUsingRunnable {

	public static void main(String[] args) {

		System.out.println(" main thread started : " + Thread.currentThread().getName());

		System.out.println("Creating Runnable...");

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside : " + Thread.currentThread().getName());

			}
		};

		System.out.println("Creating Thread...");
		Thread thread = new Thread(runnable, "thread siva");

		System.out.println("Starting Thread...");
		thread.start();

		System.out.println(" main thread ended : " + Thread.currentThread().getName());
		
		int a = 10;
		
		int b = 20;
		
		System.out.println("a + b " + a+b);
		
	}

}
