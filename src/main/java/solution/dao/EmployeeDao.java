package solution.dao;

import java.util.List;

import solution.employee.Employee;

public interface EmployeeDao {
	void add(Employee employee);
	List<Employee> listEmployee();

}
