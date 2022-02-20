package o_oops.methods;

import m_model.Employee1;

public class HashCodeExampleAfterOVerride {

	public static void main(String[] args) {

		Employee1 emp1 = new Employee1(918, "Maria", "M");
		Employee1 emp2 = new Employee1(918, "Maria", "M");

		// invoking hashCode() method
		int a = emp1.hashCode();
		int b = emp2.hashCode();

		System.out.println("hashcode of emp1 = " + a);
		System.out.println("hashcode of emp2 = " + b);
		System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));

		// Change Employee ID to Integer will get false for the below line
		System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));

	}
}
