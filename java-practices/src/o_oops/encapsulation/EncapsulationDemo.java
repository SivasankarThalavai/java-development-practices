package o_oops.encapsulation;

public class EncapsulationDemo {

	// Encapsulation refers to combining data and associated functions as a single
	// unit.
	// encapsulation is also referenced as the data-hiding mechanism
	// implemented via the access modifiers - public, private, and protected
 
	// Encapsulation: Information hiding.

	public static void main(String[] args) {

		Customer customerObj = new Customer();
		
        // setting values of the variables
		customerObj.setAge("12");
		customerObj.setCustomerName("siva");
		customerObj.setSsn("123456");
		
		System.out.println("Name: " + customerObj.getCustomerName());
		System.out.println("Age: " + customerObj.getAge());
		System.out.println("SSN: " + customerObj.getSsn());
		
		// Direct access of geekRoll is not possible due to encapsulation
        // System.out.println("Geek's roll: " + customerObj.age);
	}

}
