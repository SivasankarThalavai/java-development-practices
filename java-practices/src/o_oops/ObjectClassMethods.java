package o_oops;

import java.util.Date;

class Person123 implements Cloneable {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person123 person = (Person123) super.clone();
		return person;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

public class ObjectClassMethods {

	// protected Object clone()
	// boolean equals(Object obj)
	// protected void finalize()
	// Class<?> getClass()
	// int hashCode()
	// void notify()
	// void notifyAll()
	// void wait()
	// String toString()

	public static void main(String[] args) throws CloneNotSupportedException {

		//
		Date date = new Date();
		System.out.println(date.toString());

		Date date2 = (Date) date.clone();
		System.out.println(date2.toString());

		// USer defined object clone
		Person123 person = new Person123();
		person.setFirstName("siva");
		person.setLastName("sankar");
		Person123 person2 = (Person123) person.clone();

		System.out.println(person.toString());
		System.out.println(person2.toString());

	}

}
