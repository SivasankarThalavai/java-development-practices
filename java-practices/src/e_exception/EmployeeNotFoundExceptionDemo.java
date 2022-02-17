package e_exception;

class EmployeeNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String msg) {
		super(msg);

	}

}

public class EmployeeNotFoundExceptionDemo {

	public void empIDCheck(int EmpID) throws EmployeeNotFoundException {
		if (EmpID <= 0 || EmpID > 999) {
			throw new EmployeeNotFoundException("Invalid Employee ID");
		} else {
			System.out.println("You are an employee");
		}
	}

	public static void main(String[] args) {

		EmployeeNotFoundExceptionDemo empDemo = new EmployeeNotFoundExceptionDemo();
		try {
			empDemo.empIDCheck(1112);
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
