package h_multi_threading;

class Producer extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Producer : Produced Item " + i);
			// Thread.yield();
		}
	}

}

class Consumer extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Consumer : Consumed Item " + i);
			// Thread.yield();
		}
	}

}

public class ProducerConsumerWithoutAndWithYield {

	public static void main(String[] args) {

		Thread producer = new Producer();
		Thread consumer = new Consumer();

		producer.setPriority(Thread.MIN_PRIORITY); // Min Priority
		consumer.setPriority(Thread.MAX_PRIORITY); // Max Priority

		producer.start();
		consumer.start();
	}

}

// with out yield
//
//I am Consumer : Consumed Item 0
//I am Consumer : Consumed Item 1
//I am Producer : Produced Item 0
//I am Consumer : Consumed Item 2
//I am Producer : Produced Item 1
//I am Consumer : Consumed Item 3
//I am Producer : Produced Item 2
//I am Consumer : Consumed Item 4
//I am Producer : Produced Item 3
//I am Producer : Produced Item 4


//  with yield
//
//I am Producer : Produced Item 0
//I am Producer : Produced Item 1
//I am Producer : Produced Item 2
//I am Consumer : Consumed Item 0
//I am Producer : Produced Item 3
//I am Producer : Produced Item 4
//I am Consumer : Consumed Item 1
//I am Consumer : Consumed Item 2
//I am Consumer : Consumed Item 3
//I am Consumer : Consumed Item 4
