package o_oops.coupling;

class Car1 {

	public void move() {
		System.out.println("Car is moving");
	}
}

class Traveler1 {

	Car1 c = new Car1();

	public void startJourney() {
		c.move();
	}
}

public class TightCouplingDemo {

	public static void main(String[] args) {

		Traveler1 tv = new Traveler1();
		tv.startJourney();
	}

}
