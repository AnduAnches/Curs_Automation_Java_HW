package TheBuilding;

import TheBuilding.Equipment.ConfEquipment;
import TheBuilding.Floors.ConfRoom;
import TheBuilding.Floors.Floor;
import TheBuilding.Floors.Kitchen;
import TheBuilding.Floors.OfficeSpace;

public class Main {

	public static void main(String[] args) {

		Building theBuilding = new Building("The Building");
		Floor floorOne = new Floor("Floor 1");
		theBuilding.addFloor(1, floorOne);

		OfficeSpace officeSpaceFirstFloor = new OfficeSpace("Office Space 1", 20);
		floorOne.addRooms(officeSpaceFirstFloor);

		ConfRoom confRoomOneFirstFloor = new ConfRoom("Conference Room 1", 10);
		floorOne.addRooms(confRoomOneFirstFloor);
		confRoomOneFirstFloor.addEquipment(ConfEquipment.TV);
		confRoomOneFirstFloor.addEquipment(ConfEquipment.VIDEO_PROJECTOR);
		ConfRoom confRoomTwoFirstFloor = new ConfRoom("Conference Room 2", 10);
		floorOne.addRooms(confRoomTwoFirstFloor);
		confRoomTwoFirstFloor.addEquipment(ConfEquipment.TV);
		ConfRoom confRoomThreeFirstFloor = new ConfRoom("Conference Room 3", 10);
		floorOne.addRooms(confRoomThreeFirstFloor);
		confRoomThreeFirstFloor.addEquipment(ConfEquipment.TV);

		Kitchen kitchen = new Kitchen("Floor 1 Kitchen");
		floorOne.addRooms(kitchen);


		
		int noOfFloors = theBuilding.getFloors().size();
		// int noOfOfficeSpacesFloorOne = floorOne.getOfficeSpaces().size();
		// int noOfConfRoomsFloorOne = floorOne.getConfRooms().size();
		
		// System.out.println(theBuilding.toString() + " has " + noOfFloors + " floors.\n" + floorOne.toString() + ":\n\t"
		// + noOfOfficeSpacesFloorOne + " Office spaces:\n\t\t" + officeSpaceFirstFloor.toString() + ": "
		// + officeSpaceFirstFloor.getNoOfDesks() + " desks");

		floorOne.printOfficeSpaces();
		floorOne.printConfRooms();
		floorOne.printKitchens();
	}


}
