package TheBuilding.Floors;

import java.util.ArrayList;

import TheBuilding.Equipment.Desk;

public class OfficeSpace extends Room {
	
	private ArrayList<Desk> desks = new ArrayList<>();

	public OfficeSpace(String name, int noOfdesks) {
		super(name);
		for (int i = 0; i < noOfdesks; i++) {
			Desk desk = new Desk();
			this.desks.add(desk);
		}
	}
	
	public void addDesk(Desk desk) {
		this.desks.add(desk);
	}

	public int getNoOfDesks() {
		return (this.desks.size());
	}
}
