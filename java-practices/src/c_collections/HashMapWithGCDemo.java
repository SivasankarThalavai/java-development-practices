package c_collections;

import java.util.HashMap;

public class HashMapWithGCDemo {

	public static void main(String[] args) {

		HashMap<Demo, Object> m = new HashMap<>();
		Demo d = new Demo();

		// puts an entry into HashMap
		m.put(d, " Hi ");

		System.out.println(m);
		d = null;

		// garbage collector is called
		System.gc();

		// thread sleeps for 4 sec
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(m);
	}

}
