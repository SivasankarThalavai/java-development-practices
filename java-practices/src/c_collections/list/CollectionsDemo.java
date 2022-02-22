package c_collections.list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();// Creating arraylist

		names.add("Ravi");// Adding object in arraylist
		names.add("Vijay");
		names.add("Ravi");
		names.add("Ajay");

		// Traversing list through Iterator
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			// itr.remove();
		}

		/*
		 * LinkedList implements the Collection interface. It uses a doubly linked list
		 * internally to store the elements. It can store the duplicate elements. It
		 * maintains the insertion order and is not synchronized. In LinkedList, the
		 * manipulation is fast because no shifting is required.
		 */

		System.out.println("*****************LinkedList********************");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ravi");
		ll.add("Ajay");

		Iterator<String> itr1 = ll.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		// Vector uses a dynamic array to store the data elements. It is similar to
		// ArrayList. However, It is synchronized and contains many methods that are not
		// the part of Collection framework.
		System.out.println("*****************Vector********************");
		Vector<String> v = new Vector<String>();
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
		Iterator<String> itr3 = v.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

		System.out.println("*****************Stack********************");
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		stack.pop();

		Iterator<String> itr4 = stack.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}

		System.out.println("*****************PriorityQueue********************");
		/*
		 * The PriorityQueue class implements the Queue interface. It holds the elements
		 * or objects which are to be processed by their priorities. PriorityQueue
		 * doesn't allow null values to be stored in the queue.
		 */

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");

		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());

		System.out.println("\niterating the queue elements:");

		Iterator<String> itr5 = queue.iterator();
		while (itr5.hasNext()) {
			System.out.println(itr5.next());
		}
		queue.remove();
		queue.poll();

		System.out.println("\nafter removing two elements:");
		Iterator<String> itr6 = queue.iterator();
		while (itr6.hasNext()) {
			System.out.println(itr6.next());
		}

		/*
		 * Deque interface extends the Queue interface. In Deque, we can remove and add
		 * the elements from both the side. Deque stands for a double-ended queue which
		 * enables us to perform the operations at both the ends.
		 */
		System.out.println("*****************Deque********************");

		// ArrayDeque is faster than ArrayList and Stack and has no capacity
		// restrictions.

		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");

		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}

		System.out.println("*****************HashSet********************");
		/*
		 * HashSet class implements Set Interface. It represents the collection that
		 * uses a hash table for storage. Hashing is used to store the elements in the
		 * HashSet. It contains unique items.
		 */

		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		set.add(null);

		// Traversing elements
		Iterator<String> itr7 = set.iterator();
		while (itr7.hasNext()) {
			System.out.println(itr7.next());
		}

		System.out.println("*****************LinkedHashSet********************");
		/*
		 * LinkedHashSet class represents the LinkedList implementation of Set
		 * Interface. It extends the HashSet class and implements Set interface. Like
		 * HashSet, It also contains unique elements. It maintains the insertion order
		 * and permits null elements.
		 */

		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("Ravi");
		set1.add("Vijay");
		set1.add("Ravi");
		set1.add("Ajay");
		set1.add(null);

		Iterator<String> itr8 = set1.iterator();
		while (itr8.hasNext()) {
			System.out.println(itr8.next());
		}

		System.out.println("*****************HashSet********************");
		/*
		 * Java TreeSet class implements the Set interface that uses a tree for storage.
		 * Like HashSet, TreeSet also contains unique elements. However, the access and
		 * retrieval time of TreeSet is quite fast. The elements in TreeSet stored in
		 * ascending order.
		 */

		// Creating and adding elements
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("Ravi");
		set2.add("Vijay");
		set2.add("Ravi");
		set2.add("Ajay");
		// traversing elements
		Iterator<String> itr9 = set2.iterator();
		while (itr9.hasNext()) {
			System.out.println(itr9.next());
		}

	}

}
