import business.abstracts.UserService;
import business.concrete.UserManager;
import dataAccess.concrete.UserDaoManager;
import entities.concrete.User;

public class Main {
	public static void main(String[]args) {
	UserService user=new UserManager();
	user.add(new UserDaoManager(),new User(1,"Murat", "Þahin", "mrtmrt@gmail.com", "msdflk"));
	user.add(new UserDaoManager(),new User(2,"Mffg", "dda", "rt@gmail.com", "aaaaaa"));
	user.add(new UserDaoManager(),new User(3,"M", "dda", "adana@gmail.com", "mgkfl"));
	user.add(new UserDaoManager(),new User(4,"Kadir", "Cücener", "kadr@gmail.com", "bbbbbb"));
	user.addGoogle(new UserDaoManager(), new User(5,"Baki", "Çiçek", "bak@gmail.com", "cccccc"));
	user.add(new UserDaoManager(),new User(4,"Kadir", "Cücener", "kadr@gmail.com", "bbbbbb"));
	
	user.login(new User(1,"Murat", "Þahin", "mrtmrt@gmail.com", "msdflk"));
	}
}

