package c_collections;

import java.util.WeakHashMap;

public class WeakHashMapWithGCDemo {

	public static void main(String[] args) throws InterruptedException {

		WeakHashMap<Demo, Object> m = new WeakHashMap<>();
		Demo d = new Demo();

		// puts an entry into WeakHashMap
		m.put(d, " Hi ");
		System.out.println(m);

		d = null;

		// garbage collector is called
		System.gc();

		// thread sleeps for 4 sec
		Thread.sleep(4000);

		System.out.println(m);
	}

}
