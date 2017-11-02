package solution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solution.dao.RentDao;
import solution.entities.Rent;

@Service
public class RentServiceImpl implements RentService {
	
	@Autowired
	private RentDao dao;
	
	@Override
	public void addRent(Rent rent) {
		this.dao.add(rent);

	}

	@Override
	public List<Rent> listRents() {
		return this.dao.listRent();
	}

}
