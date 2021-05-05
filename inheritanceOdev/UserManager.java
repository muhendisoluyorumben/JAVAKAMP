

public class UserManager {
	User user=new User();
	public void add(User user) {
		this.user=user;
		System.out.println("Eklendi "+user.getName());
	}
}
