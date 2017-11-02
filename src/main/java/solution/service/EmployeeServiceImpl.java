package solution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solution.dao.EmployeeDao;
import solution.entities.Employee;
import solution.entities.Rent;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	
	@Override
	public void addEmployee(Employee employee) {
		employeeDao.add(employee);

	}

	@Override
	public List<Employee> listEmployee() {
		return employeeDao.listEmployee();
	}

	@Override
	public List<Rent> listRentsForEmployee(Employee employee) {
		return employeeDao.listRentsForEmployee(employee);
	}

}
