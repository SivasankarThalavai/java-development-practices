package o_oops;

interface Vehicle {

	public void move();
}

class Car implements Vehicle {

	@Override
	public void move() {
		System.out.println("Car is moving");
	}
}

class Bike implements Vehicle {

	@Override
	public void move() {
		System.out.println("Bike is moving");
	}
}

class Traveler {

	// holds the reference to the Vehicle interface.
	private Vehicle v;

	public Vehicle getVehicle() {
		return v;
	}

	public void setVehicle(Vehicle v) {
		this.v = v;
	}

	public void startJourney() {
		v.move();
	}
}

public class LooseCouplingDemo {

	public static void main(String[] args) {

		Traveler traveler = new Traveler();

		traveler.setVehicle(new Car()); // Inject Car dependency
		traveler.startJourney(); // start journey by Car

		traveler.setVehicle(new Bike()); // Inject Bike dependency
		traveler.startJourney(); // Start journey by Bike
	}

}
