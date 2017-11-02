package solution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solution.dao.EquipmentDao;
import solution.entities.Equipment;

@Service
public class EquipmentServiceImpl implements EquipmentService {
	@Autowired
	private EquipmentDao equipmentDao;
	

	@Override
	public void addEquipment(Equipment equipment) {
		this.equipmentDao.add(equipment);

	}

}
