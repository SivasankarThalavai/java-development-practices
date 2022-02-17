package e_exception;

class TestFinallyBlock {

	public static void main(String args[]) {

		try {
			int data = 25 / 5;
			int data1 = 25 / 0;
			System.out.println(data);
			System.exit(0);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of phe code...");
	}
}