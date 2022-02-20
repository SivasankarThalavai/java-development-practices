package o_oops;

class S2 {

	void m(S2 obj) {
		System.out.println("method is invoked");
	}

	void p() {
		m(this);
	}

}

public class ThisAsAnArgument {

	public static void main(String[] args) {
		S2 s2 = new S2();
		s2.p();
	}

}
