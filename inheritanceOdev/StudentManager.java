package inheritanceOdev;

public class StudentManager extends UserManager{
	User user=new User();
	public void add(User user) {
		this.user=user;
		System.out.println("Öğrenci eklendi "+user.getName());
	}
}
