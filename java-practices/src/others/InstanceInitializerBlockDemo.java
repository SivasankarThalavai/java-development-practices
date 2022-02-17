package others;

public class InstanceInitializerBlockDemo {

	int speed;

	InstanceInitializerBlockDemo() {
		System.out.println("constructor is invoked");
		System.out.println("speed is " + speed);
	}

	public static void main(String[] args) {

		InstanceInitializerBlockDemo demo1 = new InstanceInitializerBlockDemo();
		InstanceInitializerBlockDemo demo2 = new InstanceInitializerBlockDemo();
	}

	{
	    {System.out.println("instance initializer block invoked");}  
		speed = speed + 100;
	}

}
