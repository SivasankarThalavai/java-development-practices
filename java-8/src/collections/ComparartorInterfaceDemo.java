package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparartorInterfaceDemo {

	/*
	 * This interface is found in java.util package and contains 2 methods
	 * compare(Object obj1,Object obj2) and equals(Object element).
	 * 
	 * It provides multiple sorting sequences, i.e., you can sort the elements on
	 * the basis of any data member, for example, rollno, name, age or anything
	 * else.
	 * 
	 * Collections class provides static methods for sorting the elements of a
	 * collection. If collection elements are of Set or Map, we can use TreeSet or
	 * TreeMap. However, we cannot sort the elements of List. Collections class
	 * provides methods for sorting the elements of List type elements also.
	 * 
	 * 
	 */

	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		// sort by age
		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return (o1.getAge() - o2.getAge());
			}
		});

		System.out.println("anonymous Sort by age");
		Iterator<Student> itr1 = al.iterator();
		while (itr1.hasNext()) {
			Student st = (Student) itr1.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		Collections.sort(al, new AgeComparator());
		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}

/*
 * Sorting by Name
 * 
 * 106 Ajay 27 105 Jai 21 101 Vijay 23
 * 
 * 
 * 
 * Sorting by age
 * 
 * 105 Jai 21 101 Vijay 23 106 Ajay 27
 */
