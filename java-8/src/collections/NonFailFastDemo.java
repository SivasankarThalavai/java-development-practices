package collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class NonFailFastDemo {

	public static void main(String args[]) {

		// CopyOnWriteArrayList
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 7, 9, 11 });
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(Thread.currentThread().getName());
			Integer i = itr.next();
			System.out.println(i);
			if (i == 7)
				list.add(15); // It will not be printed
			// This means it has created a separate copy of the collection
		}
		
		
		// ConcurrentHashMap
		ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<String, Integer>();
		concurrentMap.put("ONE", 1); // Adding values
		concurrentMap.put("SEVEN", 7);
		concurrentMap.put("FIVE", 5);
		concurrentMap.put("EIGHT", 8);
		// Getting an iterator using map
		Iterator<String> it = concurrentMap.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(Thread.currentThread().getName());
			String key = (String) it.next();
			System.out.println(key + " : " + concurrentMap.get(key));
			// This will reflect in iterator.
			// This means it has not created separate copy of objects
			concurrentMap.put("NINE", 9);
		}
}
}
/*
 * CopyOnWriteArrayList output
 * 
 * main 1 main 7 main 9 main 11
 * 
 */

/*
 * ConcurrentHashMap output
 * 
 * EIGHT:8 
 * FIVE:5 
 * NINE:9 
 * ONE:1 
 * SEVEN:7
 * 
 * 
 * 
 * From the above example, we can see we are iterating the collection while the other thread is performing. 
 * 
 * The iteration result is placed in the same collection, which means it is not creating any separate copy of the object and also does not throwing any ConcurrentModificationException.
 * 
 */


/*
 * From the above examples, we can notice the following points about the Fail Safe iterators:
 * 
 * We can perform the modification operations on a collection while iterating over it. 
 * 
 * They will not throw ConcurrentModificationException during the iteration. 
 * 
 * The Fail Safe iterators use a copy of the collection to traverse over the elements. Unlike the Fail Fast, they require more memory as they
 * cloned the collection. 
 * 
 * The examples of Fail Safe iterators are ConcurrentHashMap, CopyOnWriteArrayList, etc.
 * 
 */


