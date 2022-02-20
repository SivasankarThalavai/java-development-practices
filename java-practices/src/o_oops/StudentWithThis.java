package o_oops;

public class StudentWithThis {

	int rollno;
	String name;
	float fee;

	StudentWithThis(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}
