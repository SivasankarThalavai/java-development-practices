package c_functional_interfaces;

import java.util.function.Function;

public class FunctionFunctionalInterface {

	public static void main(String[] args) {

		Function<PersonEntity, PersonDTO> function = (entity) -> {
			return new PersonDTO(entity.getName(), entity.getAge());
		};

		PersonDTO personDTO = function.apply(new PersonEntity("siva", 30));
		System.out.println(personDTO.getName());
		System.out.println(personDTO.getAge());
	}
}

class PersonEntity {
	
	private String name;
	private int age;

	public PersonEntity(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class PersonDTO {
	private String name;
	private int age;

	public PersonDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}