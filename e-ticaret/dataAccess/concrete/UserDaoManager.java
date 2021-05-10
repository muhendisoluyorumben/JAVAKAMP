package dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class UserDaoManager implements UserDao{
	
	List<User> users =new ArrayList<User>();
	
	
	public UserDaoManager() {
		
	}
	
	@Override
	public void add(User user) {
		
		this.users.add(user);
		System.out.printf("Kullanýcý veritabanýna eklendi\n");	
		for(User usera:this.users) {
			System.out.println(usera.getFirstName());
		}
	}

	@Override
	public void upgrade(User user) {
		
				
	}

	@Override
	public void delete(User user) {
				
	}

	@Override
	public List<User> getAll() {
		
		return this.users;
	}

	@Override
	public User get(int id) {
		System.out.println("Daodayýz "+this.users.size());
		for(User usera:this.users) {
			System.out.println(usera.getFirstName());
		}
		return this.users.get(id);
	}

}
