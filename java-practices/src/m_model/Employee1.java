package m_model;

public class Employee1 {

	private int id;
	private String firstName;
	private String lastName;
	private Integer age;

	public Employee1(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee1(int id, String firstName, String lastName, Integer age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this || this.getClass() == obj.getClass())
			return true;
		return this.getId() == ((Employee1) obj).getId();
	}

	@Override
	public String toString() {
		return "\n[" + this.id + "," + this.firstName + "," + this.lastName + "," + this.age + "]";
	}
}
