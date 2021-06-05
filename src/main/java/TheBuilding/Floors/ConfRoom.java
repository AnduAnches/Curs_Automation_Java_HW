package TheBuilding.Floors;

import java.util.ArrayList;

import TheBuilding.Equipment.ConfEquipment;
import TheBuilding.Equipment.Seat;

public class ConfRoom extends Room {

	private ArrayList<Seat> seats = new ArrayList<>();
	private ArrayList<ConfEquipment> confRoomEquipment = new ArrayList<>();

	public ConfRoom(String name, int noOfseats) {
		super(name);
		for (int i = 0; i < noOfseats; i++) {
			Seat seat = new Seat();
			this.seats.add(seat);
		}
	}

	public void addSeat(Seat seat) {
		this.seats.add(seat);
	}

	public void addEquipment(ConfEquipment equipment) {
		confRoomEquipment.add(equipment);
	}

	public int getNoOfSeats() {
		return (seats.size());
	}

	public ArrayList<ConfEquipment> getEquipment() {
		return confRoomEquipment;
	}
}