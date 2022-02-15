package o_oops.encapsulation;

public class Customer {

	// private variables declared these can only be accessed by public methods of
	// class
	private String customerName;
	private String age;
	private String ssn;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	// get method for age to access private variable age
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	protected String getSsn() {
		return ssn;
	}

	protected void setSsn(String ssn) {
		this.ssn = ssn;
	}

}
