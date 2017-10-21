package solution.service;

import java.util.List;

import solution.employee.Employee;

public interface EmployeeService {
	void addEmployee(Employee employee);
	List<Employee> listEmployee(); 
}
