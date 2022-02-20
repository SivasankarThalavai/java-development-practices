package o_oops;

class Student1 {

	int rollno;
	String name, course;
	float fee;

	Student1(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student1(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor must be the first statement in constructor.
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

public class ReusingConstructorDemo {

	public static void main(String[] args) {

		Student1 s1 = new Student1(111, "siva", "java");
		Student1 s2 = new Student1(112, "sankar", "java", 6000f);
		s1.display();
		s2.display();
	}

}
