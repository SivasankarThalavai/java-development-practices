package c_collections;

import java.util.Comparator;

class NameComparator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {
		SStudent s1 = (SStudent) o1;
		SStudent s2 = (SStudent) o2;

		return s1.name.compareTo(s2.name);
	}
}