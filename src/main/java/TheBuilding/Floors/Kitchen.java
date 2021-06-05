package TheBuilding.Floors;

import java.util.ArrayList;

import TheBuilding.Equipment.KitchenEquipment;

public class Kitchen extends Room {

	private ArrayList<KitchenEquipment> kitchenEquipments = new ArrayList<>();

	public Kitchen(String name) {
		super(name);
		for (KitchenEquipment kitchenEquipment : KitchenEquipment.values()) {
			this.kitchenEquipments.add(kitchenEquipment);
		}
	}

	public ArrayList<KitchenEquipment> getKitchenEquipments() {
		return kitchenEquipments;
	}

	public void addKitchenEquipments(KitchenEquipment kitchenEquipment) {
		this.kitchenEquipments.add(kitchenEquipment);
	}
}

