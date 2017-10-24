package solution.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import solution.employee.Employee;

@Repository
public class EmployeeDaoImplemented implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session currentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	
	@Override
	@Transactional
	public void add(Employee employee) {
		currentSession().save(employee);
	}

	@Override
	@Transactional
	public List<Employee> listEmployee() {
		TypedQuery<Employee> query = currentSession().createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		return employees;
	}

}
