package solution.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import solution.entities.Rent;

@Repository
public class RentDaoImpl implements RentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session currentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	@Transactional
	public void add(Rent rent) {
		currentSession().save(rent);
	}

	@Override
	public List<Rent> listRent() {
		@SuppressWarnings("unchecked")
		TypedQuery<Rent> query = currentSession().createQuery("form Rent");
		List<Rent> rent = query.getResultList();
		return rent;
	}
	
}
