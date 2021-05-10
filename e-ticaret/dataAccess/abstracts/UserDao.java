package dataAccess.abstracts;

import java.util.List;

import entities.concrete.User;

public interface UserDao {
	public void add(User user);
	public void upgrade(User user);
	public void delete(User user);
	
	List<User> getAll();
	User get(int id);
}
