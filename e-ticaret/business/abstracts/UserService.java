package business.abstracts;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public interface UserService {
	public void add(UserDao userDao, User user);
	public void login(User user);
	public void addGoogle(UserDao userDao, User user);
	public void loginGoogle(User user);
	List<User> getAll();
	User get(int id);
}
