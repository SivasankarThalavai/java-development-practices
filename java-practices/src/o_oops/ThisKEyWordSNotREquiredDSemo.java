package o_oops;

class Student {

	int rollno;
	String name;
	float fee;

	Student(int r, String n, float f) {
		rollno = r;
		name = n;
		fee = f;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class ThisKEyWordSNotREquiredDSemo {

	public static void main(String[] args) {
		Student s1 = new Student(111, "siva", 6000f);
		Student s2 = new Student(112, "sankar", 6000f);
		s1.display();
		s2.display();

	}

}
