

public class InstructorManager extends UserManager{
	User user=new User();
	public void add(User user) {
		this.user=user;
		System.out.println("Öðretmen eklendi "+user.getName());
	}
}
