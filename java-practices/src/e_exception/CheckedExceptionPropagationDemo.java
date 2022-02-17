package e_exception;

import java.io.IOException;

// By default, Checked Exceptions are not forwarded in calling chain (propagated).

public class CheckedExceptionPropagationDemo {

	void m() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String[] args) {

		CheckedExceptionPropagationDemo obj = new CheckedExceptionPropagationDemo();
		obj.p();
		System.out.println("normal flow");
	}

}
