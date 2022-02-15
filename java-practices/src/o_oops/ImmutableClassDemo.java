package o_oops;

import java.util.HashMap;
import java.util.Map;

final class Customer {

	// Member attributes of final class
	private final String name;
	private final int regNo;
	private final Map<String, String> metadata;

	public Customer(String name, int regNo, Map<String, String> metadata) {

		this.name = name;
		this.regNo = regNo;

		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}

		this.metadata = tempMap;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	// Note that there should not be any setters

	public Map<String, String> getMetadata() {
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
}

public final class ImmutableClassDemo {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");

		Customer cust1 = new Customer("Siva", 101, map);
		System.out.println(cust1.getName() + " " + cust1.getRegNo() + " " + cust1.getMetadata());

		// cust1.regNo = 102

		// Remains unchanged due to deep copy in constructor
		map.put("3", "third");
		System.out.println(cust1.getName() + " " + cust1.getRegNo() + " " + cust1.getMetadata());

        // Remains unchanged due to deep copy in getter
		cust1.getMetadata().put("4", "fourth");
		System.out.println(cust1.getName() + " " + cust1.getRegNo() + " " + cust1.getMetadata());

	}
}


// after immuable

//Siva 101 {1=first, 2=second}
//Siva 101 {1=first, 2=second}
//Siva 101 {1=first, 2=second}

