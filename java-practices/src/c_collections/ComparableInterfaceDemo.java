package c_collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterfaceDemo {

	/*
	 * This interface is found in java.lang package and contains only one method named compareTo(Object).
	 * 
	 * single sorting sequence 
	 * 
	 * Java Comparable interface, we can sort the elements of:
	 * 
	 * String objects Wrapper class objects User-defined class objects
	 * 
	 * Note: String class and Wrapper classes implement the Comparable interface by
	 * default. So if you store the objects of string or wrapper classes in a list,
	 * set or map, it will be Comparable by default.
	 */

	public static void main(String args[]) {
		
		ArrayList<SStudent> al = new ArrayList<SStudent>();
		al.add(new SStudent(101, "Vijay", 23));
		al.add(new SStudent(106, "Ajay", 27));
		al.add(new SStudent(105, "Jai", 21));

		Collections.sort(al);
		for (SStudent st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}

/*
 * natural order output
 
 * 105 Jai 21 
 * 101 Vijay 23 
 * 106 Ajay 27
 * 
 * 
 * reverse order output
 *  106 Ajay 27
 *	101 Vijay 23
 *	105 Jai 21
 * 
 */

