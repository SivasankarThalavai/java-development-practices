package h_multi_threading;

class TestSleepMethod1 extends Thread {
	
	public void run() {
		
		for (int i = 1; i < 5; i++) {
			// the thread will sleep for the 500 milli seconds
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " -> " + i );
		}
	}

	public static void main(String args[]) {
		
		Thread t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		
		t1.setName("T1");
		t2.setName("T2");

		t1.start();
		t2.start();
	}
}