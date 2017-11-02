package solution.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Enumerated
	private EquipmentStatus active;
	@Embedded
	private EquipmentType equipmentType;
	
	public Equipment() {}

	public Equipment(EquipmentStatus active, EquipmentType equipmentType) {
		super();
		this.active = active;
		this.equipmentType = equipmentType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EquipmentStatus getActive() {
		return active;
	}

	public void setActive(EquipmentStatus active) {
		this.active = active;
	}

	public EquipmentType getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(EquipmentType equipmentType) {
		this.equipmentType = equipmentType;
	}

	@Override
	public String toString() {
		return "Equipment [id=" + id + ", active=" + active + ", equipmentType=" + equipmentType + "]";
	}
	
	
}
