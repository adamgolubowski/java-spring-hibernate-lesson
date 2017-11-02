package solution.service;

import java.util.List;

import solution.entities.Employee;
import solution.entities.Rent;

public interface EmployeeService {
	public void addEmployee(Employee employee);
	public List<Employee> listEmployee(); 
	public List<Rent> listRentsForEmployee(Employee employee);
}
