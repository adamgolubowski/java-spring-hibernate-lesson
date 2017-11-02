package solution.dao;

import java.util.List;

import solution.entities.Rent;

public interface RentDao {
	public void add(Rent rent);
	public List<Rent> listRent();

}
