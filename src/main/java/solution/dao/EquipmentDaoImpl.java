package solution.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import solution.entities.Equipment;

@Repository
public class EquipmentDaoImpl implements EquipmentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session currentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	@Transactional
	public void add(Equipment equipment) {
		currentSession().save(equipment);
	}

	@Override
	@Transactional
	public List<Equipment> listEquipment() {
		@SuppressWarnings("unchecked")
		TypedQuery<Equipment> query= currentSession().createQuery("from Equipment");
		List<Equipment> equipment = query.getResultList();
		return equipment;
	}

}
