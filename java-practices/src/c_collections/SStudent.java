package c_collections;

public class SStudent implements Comparable<SStudent> {

	int rollno;
	String name;
	int age;

	SStudent(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// natural order

	/*
	 * public int compareTo(Student st) { if (age == st.age) return 0; else if (age
	 * > st.age) return 1; else return -1;
	 */

	// reverse order
	public int compareTo(SStudent st) {
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		else
			return -1;
	}
}
