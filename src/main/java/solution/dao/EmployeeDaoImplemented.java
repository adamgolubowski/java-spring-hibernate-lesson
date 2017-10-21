package solution.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import solution.employee.Employee;

@Repository
public class EmployeeDaoImplemented implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Transaction trans;
	
	private Session currentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public void add(Employee employee) {
		trans = currentSession().beginTransaction();
		currentSession().save(employee);
		trans.commit();

	}

	@Override
	public List<Employee> listEmployee() {
		//@SuppressWarnings("unchecked")
		trans = currentSession().beginTransaction();
		TypedQuery<Employee> query = currentSession().createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		trans.commit();
		return employees;
	}

}
