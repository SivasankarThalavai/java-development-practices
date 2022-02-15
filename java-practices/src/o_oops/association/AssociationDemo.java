package o_oops.association;

import java.util.List;

// Association is a relation between two separate classes which establishes through their Objects. 
// Association can be one-to-one, one-to-many, many-to-one, many-to-many.

// Multiple students can associate with a single teacher and a single student can associate with multiple teachers. 
// But there is no ownership between the objects and both have their own lifecycle. 
// Both can be created and deleted independently.

class Teacher {

	private String name;
	private List<Student> students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}

class Student {

	private String name;
	private List<Teacher> teachers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

}

public class AssociationDemo {

	public static void main(String[] args) {

	}

}
