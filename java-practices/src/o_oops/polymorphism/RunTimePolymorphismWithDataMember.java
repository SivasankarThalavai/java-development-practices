package o_oops.polymorphism;

class Bike {
	int speedlimit = 90;
}

class Honda extends Bike {
	int speedlimit = 150;
}

public class RunTimePolymorphismWithDataMember extends Honda {

	// Runtime polymorphism can't be achieved by data members. There is overriddent
	// happening

	public static void main(String[] args) {
		Honda bike = new Honda();
		System.out.println(bike.speedlimit); // 90
	}

}
