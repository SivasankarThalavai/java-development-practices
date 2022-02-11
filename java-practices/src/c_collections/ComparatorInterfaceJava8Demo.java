package c_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import m_model.Employee;

public class ComparatorInterfaceJava8Demo {

	private static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(6, "Yash", "Chopra", 25));
		employees.add(new Employee(2, "Aman", "Sharma", 28));
		employees.add(new Employee(3, "Aakash", "Yaadav", 52));
		employees.add(new Employee(5, "David", "Kameron", 19));
		employees.add(new Employee(4, "James", "Hedge", 72));
		employees.add(new Employee(8, "Balaji", "Subbu", 88));
		employees.add(new Employee(7, "Karan", "Johar", 59));
		employees.add(new Employee(1, "Lokesh", "Gupta", 32));
		employees.add(new Employee(9, "Vishu", "Bissi", 33));
		employees.add(new Employee(10, "Lokesh", "Ramachandran", 60));
		return employees;
	}

	public static void main(String[] args) {

		List<Employee> employees = getEmployees();

		// Sort all employees by first name using LE
		Comparator<Employee> comparatorLE = Comparator.comparing(e -> e.getFirstName());

		// OR you can use below using Method ref
		// Comparator<Employee> comparatorMR = Comparator.comparing(e -> e.getFirstName());
		employees.sort(comparatorLE);

		// Let's print the sorted list
		System.out.println(employees);

		// Sort all employees by first name; And then reversed
		Comparator<Employee> comparator = Comparator.comparing(e -> e.getFirstName());
		employees.sort(comparator.reversed());

		// Let's print the sorted list
		System.out.println(employees);

		// Sorting on multiple fields; Group by.
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getLastName);
		employees.sort(groupByComparator);

		System.out.println(employees);

		// Parallel sort (with multiple threads)

		/*
		 * can sort the collection of objects in parallel using multiple threads as
		 * well.
		 * 
		 * It is going to be very fast if the collection is big enough to have thousands
		 * of objects.
		 * 
		 * For a small collection of objects, normal sorting is good enough and
		 * recommended.
		 */

		Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);

		// Parallel sorting
		Arrays.parallelSort(employeesArray, groupByComparator);

		System.out.println(employeesArray);
	}

}

/*
 * 
 * Sort by name [ [3,Aakash,Yaadav,52], [2,Aman,Sharma,28], [8,Balaji,Subbu,88],
 * [5,David,Kameron,19], [4,James,Hedge,72], [7,Karan,Johar,59],
 * [1,Lokesh,Gupta,32], [10,Lokesh,Ramachandran,60], [9,Vishu,Bissi,33],
 * [6,Yash,Chopra,25] ]
 * 
 * 
 * Sort by name reverse order [ [6,Yash,Chopra,25], [9,Vishu,Bissi,33],
 * [1,Lokesh,Gupta,32], [10,Lokesh,Ramachandran,60], [7,Karan,Johar,59],
 * [4,James,Hedge,72], [5,David,Kameron,19], [8,Balaji,Subbu,88],
 * [2,Aman,Sharma,28], [3,Aakash,Yaadav,52] ]
 * 
 * 
 * group sort
 * 
 * [3,Aakash,Yaadav,52], [2,Aman,Sharma,28], [8,Balaji,Subbu,88],
 * [5,David,Kameron,19], [4,James,Hedge,72], [7,Karan,Johar,59],
 * [1,Lokesh,Gupta,32], [10,Lokesh,Ramachandran,60], [9,Vishu,Bissi,33],
 * [6,Yash,Chopra,25]]
 * 
 * 
 */
