package solution.dao;

import java.util.List;

import solution.entities.Equipment;

public interface EquipmentDao {
	
	public void add(Equipment equipment);
	public List<Equipment> listEquipment();
	
}
