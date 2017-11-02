package solution.service;

import java.util.List;

import solution.entities.Rent;

public interface RentService {
	public void addRent(Rent rent);
	public List<Rent> listRents();
}
