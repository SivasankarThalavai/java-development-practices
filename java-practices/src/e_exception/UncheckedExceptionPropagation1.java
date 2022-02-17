package e_exception;

// By default Unchecked Exceptions are forwarded in calling chain (propagated).

class UncheckedExceptionPropagation1 {

	void m() {

		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {

		UncheckedExceptionPropagation1 obj = new UncheckedExceptionPropagation1();
		obj.p();
		System.out.println("normal flow...");

	}
}