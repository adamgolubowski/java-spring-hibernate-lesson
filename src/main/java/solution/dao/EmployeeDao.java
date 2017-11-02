package solution.dao;

import java.util.List;

import solution.entities.Employee;
import solution.entities.Rent;

public interface EmployeeDao {
	public void add(Employee employee);
	public List<Employee> listEmployee();
	public Employee getEmployee(int id);
	public List<Rent> listRentsForEmployee(Employee employee);
}
