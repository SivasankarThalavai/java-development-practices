package h_multi_threading;

public class TestGarbage1 {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {

		// 1) By nulling a reference:

		TestGarbage1 s1 = new TestGarbage1();
		s1 = null;

		// 2) By assigning a reference to another:

		TestGarbage1 s2 = new TestGarbage1();
		TestGarbage1 s3 = new TestGarbage1();
		s2 = s3;

		// 3) By anonymous object:
		new TestGarbage1();

		System.gc();
	}
}