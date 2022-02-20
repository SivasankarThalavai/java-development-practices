package o_oops;

class StudentWithoutThis {

	int rollno;
	String name;
	float fee;

	StudentWithoutThis(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}
