package TheBuilding;

import java.util.HashMap;
import java.util.LinkedHashMap;

import TheBuilding.Floors.Floor;

public class Building {

	String name;
	LinkedHashMap<Integer, Floor> floors = new LinkedHashMap<>();

	public Building(String name) {
		this.name = name;
	}

	public void addFloor(int floorNumber, Floor floorOne) {
		floors.put(floorNumber, floorOne);
	}

	public HashMap<Integer, Floor> getFloors() {
		return floors;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
