package solution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import solution.dao.EmployeeDao;
import solution.employee.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	
	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDao.add(employee);

	}

	@Override
	@Transactional(readOnly=true)
	public List<Employee> listEmployee() {
		return employeeDao.listEmployee();
	}

}
