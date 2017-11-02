package solution.entities;

import javax.persistence.Embeddable;

@Embeddable
public class EquipmentType {
	
	private String model;
	private int yearOfProduction;
	
	public EquipmentType() {}
	
	public EquipmentType(String model, int yearOfProduction) {
		super();
		this.model = model;
		this.yearOfProduction = yearOfProduction;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	
}
