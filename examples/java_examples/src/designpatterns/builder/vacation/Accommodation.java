package designpatterns.builder.vacation;

public abstract class Accommodation {
	String name;
	Reservation reservation = null;
	
	public void setReservation(Reservation r) {
		this.reservation = r;
	}
	public Reservation getReservation() {
		return this.reservation;
	}
	public abstract String getLocation();
        @Override
	public String toString() {
		StringBuilder display = new StringBuilder();
		display.append("You're staying at " + name);
		if (this.reservation != null) {
			display.append("\nYou have a reservation for arrival date: " + reservation.getArrivalDate() + 
					", staying for " + reservation.getNights() + " nights");
		}
		if (this.getLocation() != "") {
			display.append(" in " + this.getLocation());
		}
		display.append("\n");
		return display.toString();
	}
}