package c_collections;

import java.lang.ref.WeakReference;

class Demo1 {

	public void print() {
		System.out.println("Demo1");
	}
}

public class StrongReferneceVsWeakREference {

	public static void main(String[] args) {

		Demo1 d1 = new Demo1();
		d1.print();

		WeakReference<Demo1> weakref = new WeakReference<Demo1>(d1);
		d1 = null;

		d1 = weakref.get();

		d1.print();

	}

}
