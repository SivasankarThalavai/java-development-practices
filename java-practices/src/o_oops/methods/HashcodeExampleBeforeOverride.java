package o_oops.methods;

import m_model.Employee;

//In Java, hash code is a 32-bit signed integer value. It is a unique id provided by JVM to Java object. 

//Each Java object is associated with the hash code. 

//The hash code is managed by a hash-based data structure, such as HashTable, HashSet, etc.

//Remember: When we override the equals() method, it is necessary to override the hashCode() method, also.

//It returns a randomly generated hash code value of the object that is unique for each instance. 

//The randomly generated value might change during the several executions of the program.

//It means that it can produce the same hash code for both objects.

public class HashcodeExampleBeforeOverride {

	public static void main(String[] args) {

		Employee emp1 = new Employee(918, "Maria", "M");
		Employee emp2 = new Employee(918, "Maria", "M");

		// invoking hashCode() method
		int a = emp1.hashCode();
		int b = emp2.hashCode();

		System.out.println("hashcode of emp1 = " + a);
		System.out.println("hashcode of emp2 = " + b);
		System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));

	}
}