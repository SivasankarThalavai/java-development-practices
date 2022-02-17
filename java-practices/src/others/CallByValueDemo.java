package others;

// In call by value, the modification done to the parameter passed does not reflect in the caller's scope while in the call by reference, 
// the modification done to the parameter passed are persistent and changes are reflected in the caller's scope.

public class CallByValueDemo {

	int data;

	void change(int data) {
		data = data + 100;// changes will be in the local variable only
	}

	void change1(CallByValueDemo op) {
		op.data = op.data + 100;// changes will be in the instance variable
	}

	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
		// Swap n1 with n2
		int c = a;
		a = b;
		b = c;
		System.out.println("CALLED Method");
		System.out.println("After swapping(Inside), a = " + a + " b = " + b);
	}

	public static void main(String[] args) {

		CallByValueDemo cv = new CallByValueDemo();

		System.out.println("before change " + cv.data);
		cv.change(500);
		System.out.println("after change " + cv.data);

		System.out.println("before change " + cv.data);
		cv.change1(cv); // passing object
		System.out.println("after change " + cv.data);

		int a = 30;
		int b = 45;
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		// Invoke the swap method
		swapFunction(a, b);

		System.out.println("\nCALLER Method");
		System.out.println("**Now, Before and After swapping values will be same here**:");
		System.out.println("After swapping, a = " + a + " and b is " + b);

	}

}
