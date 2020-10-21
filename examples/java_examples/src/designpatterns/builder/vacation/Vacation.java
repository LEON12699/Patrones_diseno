package designpatterns.builder.vacation;

import java.util.*;

public class Vacation {
	String name;
	List<Accommodation> accommodations = new ArrayList<Accommodation>();
	List<String> events = new ArrayList<String>();
 
	public void setName(String name) {
		this.name = name;
	}
	public void setAccommodations(List<Accommodation> accommodations) {
		this.accommodations = accommodations;
	}
	public void setEvents(List<String> events) {
		this.events = events;
	}
        @Override
	public String toString() {
		StringBuilder display = new StringBuilder();
		display.append("---- " + this.name + " ----\n");
                accommodations.forEach(a -> {
                    display.append(a);
            });
                events.forEach(e -> {
                    display.append(e + "\n");
            });
		return display.toString();
	}
}

 
 
