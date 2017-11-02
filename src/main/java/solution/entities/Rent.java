package solution.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Rent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	private Date startDate;
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@OneToOne
	@JoinColumn(name="equipment_id")
	private Equipment eqiupment;
	
	public Rent() {}
	
	public Rent(Date startDate, Date endDate, Employee employee, Equipment eqiupment) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.employee = employee;
		this.eqiupment = eqiupment;
	}




	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Equipment getEqiupment() {
		return eqiupment;
	}

	public void setEqiupment(Equipment eqiupment) {
		this.eqiupment = eqiupment;
	}

	@Override
	public String toString() {
		return "Rent [Id=" + Id + ", startDate=" + startDate + ", endDate=" + endDate + ", employee=" + employee
				+ ", eqiupment=" + eqiupment + "]";
	}


	
}
