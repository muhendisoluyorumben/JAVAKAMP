package business.concrete;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class UserManager implements UserService {
	UserDao userDao;
	@Override
	public void add(UserDao userDao, User user) {
		this.userDao = userDao;
		Verification verification=new Verification();
		verification.verify(userDao, user);
		
	}


	@Override
	public void login(User user) {
		System.out.println("Giriþ isteði");
		System.out.println(this.userDao.get(0));
	}

	@Override
	public void addGoogle(UserDao userDao, User user) {
		System.out.println("Google Hesabý ile kayýt");
		this.userDao = userDao;
		Verification verification=new Verification();
		verification.verify(userDao, user);		
	}


	@Override
	public void loginGoogle(User user) {
		
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	




}
