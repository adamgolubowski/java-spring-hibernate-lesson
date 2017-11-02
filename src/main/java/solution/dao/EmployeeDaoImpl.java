package solution.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import solution.entities.Employee;
import solution.entities.Rent;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
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
		@SuppressWarnings("unchecked")
		TypedQuery<Employee> query = currentSession().createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		return employees;
	}
	


	@Override
	@Transactional
	public List<Rent> listRentsForEmployee(Employee employee) {
		@SuppressWarnings("unchecked")
		TypedQuery<Rent> query = currentSession().createQuery("from Rent r where r.employee.id = :theEmployeeId");
		query.setParameter("theEmployeeId", employee.getId());
		List<Rent> rents = query.getResultList();
		return rents;
	}


	@Override
	public Employee getEmployee(int id) {
		@SuppressWarnings("unchecked")
		TypedQuery<Employee> query = currentSession().createQuery("from Employee e where e.id=:employeeId");
		query.setParameter("employeeId", id);
		Employee employee = query.getSingleResult();
		return employee;
	}

}