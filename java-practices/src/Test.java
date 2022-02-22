public class Test {

	public int instanceVariable = 10;   // Test2

	public Test() {
		// test
	}

	public Test(int a) {
		// instanceVariable = a; // test1
		instanceVariable = 100; // test3
		System.out.println("a = " + a);
	}

	public static void main(String args[]) {

		Test test = new Test();
		System.out.println(test.instanceVariable);  // 10
		
		Test test1 = new Test(20);
		System.out.println(test1.instanceVariable);  // 20

		Test test2 = new Test();
		System.out.println(test2.instanceVariable);  // 10
		
		Test test3 = new Test(20);
		System.out.println(test3.instanceVariable);  // 20
		
		
		
		// test.instanceVariable = 20;
	}
}