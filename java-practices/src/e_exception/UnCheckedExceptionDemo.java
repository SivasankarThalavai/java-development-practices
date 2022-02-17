package e_exception;

public class UnCheckedExceptionDemo {

	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length()); // NullPointerException
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		try {
			String s = "abc";
			int i = Integer.parseInt(s); // NumberFormatException
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

		try {
			int a[] = new int[5];
			a[10] = 50; // ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
