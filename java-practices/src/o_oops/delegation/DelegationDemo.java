package o_oops.delegation;

interface TravelBooking {
	public void bookTicket();
}

class TrainBooking implements TravelBooking {
	@Override
	public void bookTicket() {
		System.out.println("Train ticket booked");
	}
}

class AirBooking implements TravelBooking {
	@Override
	public void bookTicket() {
		System.out.println("Flight ticket booked");
	}
}

class TicketBookingByAgent implements TravelBooking {

	TravelBooking t;

	public TicketBookingByAgent(TravelBooking t) {
		this.t = t;
	}

	// ticket booking responsibility is delegated to other class using polymorphism
	@Override
	public void bookTicket() {
		t.bookTicket();
	}
}

public class DelegationDemo {

	public static void main(String[] args) {
		
		TicketBookingByAgent agent = new TicketBookingByAgent(new TrainBooking());
		agent.bookTicket();

		agent = new TicketBookingByAgent(new AirBooking());
		agent.bookTicket();
	}
}
