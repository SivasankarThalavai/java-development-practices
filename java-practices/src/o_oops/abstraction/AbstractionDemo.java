package o_oops.abstraction;

public class AbstractionDemo {

	// Abstraction exposes to the user only those things that are relevant to them
	// and hides the remainder of the details.
	
	// Abstraction: Implementation hiding.

	public static void main(String[] args) {

		Employee contractor = new Contractor("contractor", 10, 10);
		Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);
		System.out.println(contractor.calculateSalary());
		System.out.println(fullTimeEmployee.calculateSalary());
	}
}