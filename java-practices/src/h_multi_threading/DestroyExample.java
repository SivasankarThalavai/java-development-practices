package h_multi_threading;

class ThreadNew4 extends Thread {

	ThreadNew4(String tName, ThreadGroup tgrp) {
		super(tgrp, tName);
		start();
	}

	public void run() {

		for (int j = 0; j < 100; j++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				System.out.println("The exception has been encountered " + e);
			}

		}

		System.out.println(Thread.currentThread().getName() + " thread has finished executing");
	}
}

public class DestroyExample {

	@SuppressWarnings("removal")
	public static void main(String argvs[]) throws SecurityException, InterruptedException {

		ThreadGroup parentGroup = new ThreadGroup("the parent group");

		ThreadGroup childGroup = new ThreadGroup(parentGroup, "the child group");

		ThreadNew4 th1 = new ThreadNew4("T1", parentGroup);
		System.out.println("Starting the first");

		ThreadNew4 th2 = new ThreadNew4("T2", parentGroup);
		System.out.println("Starting the second");

		// waiting until the other threads has been finished
		th1.join();
		th2.join();

		int priority = parentGroup.getMaxPriority();

		System.out.println("The maximum priority of the parent ThreadGroup: " + priority);

		if (parentGroup.isDaemon() == true) {
			System.out.println("The group is a daemon group.");
		} else {
			System.out.println("The parentGroup is not a daemon group.");
		}

		// destroying the child thread group
		childGroup.destroy();
		System.out.println(childGroup.getName() + " is destroyed.");

		// destroying the parent thread group
		parentGroup.destroy();
		System.out.println(parentGroup.getName() + " is destroyed.");
	}
}