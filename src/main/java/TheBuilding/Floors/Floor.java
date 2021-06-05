package TheBuilding.Floors;

import java.util.ArrayList;

import TheBuilding.Equipment.ConfEquipment;
import TheBuilding.Equipment.KitchenEquipment;

public class Floor {

	String name;
	ArrayList<Room> rooms = new ArrayList<>();


	public Floor(String name) {
		this.name = name;
	}

	public void addRooms(Room room) {
		this.rooms.add(room);
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void printOfficeSpaces() {
		
		for (Room room : rooms) {
			if (room instanceof OfficeSpace) {
				System.out.println("\t" + ((OfficeSpace) room).toString() + "\n\t\t" + ((OfficeSpace) room).getNoOfDesks() + " seats");
			}
		}
	}

	public void printConfRooms() {

		for (Room room : rooms) {
			if (room instanceof ConfRoom) {
				System.out.println("\t" + ((ConfRoom) room).toString() + "\n\t\t" + ((ConfRoom) room).getNoOfSeats() + "seats");

			ArrayList<ConfEquipment> allConfEquipment = ((ConfRoom) room).getEquipment();

			for (ConfEquipment confEquipment : allConfEquipment) {
					System.out.println("\t\t" + confEquipment);
				}
			}
		}
	}

	public void printKitchens() {

		for (Room room : rooms) {
			if (room instanceof Kitchen) {
				System.out.println("\t" + ((Kitchen) room).toString());

				ArrayList<KitchenEquipment> allKitchenEquipment = ((Kitchen) room).getKitchenEquipments();

				for (KitchenEquipment kitchenEquipment : allKitchenEquipment) {
					System.out.println("\t\t" + kitchenEquipment);
				}
			}
		}
	}

	@Override
	public String toString() {
		return this.name;
	}
}
