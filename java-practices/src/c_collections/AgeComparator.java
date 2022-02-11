package c_collections;

import java.util.Comparator;

class AgeComparator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {

		SStudent s1 = (SStudent) o1;
		SStudent s2 = (SStudent) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;

	}
}