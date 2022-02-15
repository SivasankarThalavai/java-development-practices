package o_oops.association;

import java.util.ArrayList;
import java.util.List;

class Student123 {

	String name;
	int id;
	String dept;

	Student123(String name, int id, String dept) {

		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

// Department class contains list of Student123 objects
// It is associated with Student123 class through its Objects
class Department {

	String name;
	private List<Student123> Student123s;

	Department(String name, List<Student123> Student123s) {
		this.name = name;
		this.Student123s = Student123s;
	}

	public List<Student123> getStudent123s() {
		return Student123s;
	}
}

//  Institute class contains list of Department Objects. 
// It is associated with Department class through its Objects
class Institute {

	String instituteName;
	private List<Department> departments;

	Institute(String instituteName, List<Department> departments) {
		this.instituteName = instituteName;
		this.departments = departments;
	}

	public int getTotalStudent123sInInstitute() {

		int noOfStudent123s = 0;
		List<Student123> Student123s;

		for (Department dept : departments) {
			Student123s = dept.getStudent123s();

			for (Student123 s : Student123s) {
				noOfStudent123s++;
			}
		}

		return noOfStudent123s;
	}
}

public class AggregationDemo {

	public static void main(String[] args) {

		Student123 s1 = new Student123("Mia", 1, "CSE");
		Student123 s2 = new Student123("Priya", 2, "CSE");
		Student123 s3 = new Student123("John", 1, "EE");
		Student123 s4 = new Student123("Rahul", 2, "EE");

		// Creating a List of CSE Student123s
		List<Student123> cse_Student123s = new ArrayList<Student123>();

		// Adding CSE Student123s
		cse_Student123s.add(s1);
		cse_Student123s.add(s2);

		// Creating a List of EE Student123s
		List<Student123> ee_Student123s = new ArrayList<Student123>();

		// Adding EE Student123s
		ee_Student123s.add(s3);
		ee_Student123s.add(s4);

		// Creating objects of EE and CSE class inside
		// main()
		Department CSE = new Department("CSE", cse_Student123s);
		Department EE = new Department("EE", ee_Student123s);

		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);

		// Lastly creating an instance of Institute
		Institute institute = new Institute("BITS", departments);

		// Display message for better readability
		System.out.print("Total Student123s in institute: ");

		// Calling method to get total number of Student123s
		// in institute and printing on console
		System.out.print(institute.getTotalStudent123sInInstitute());
	}
}
