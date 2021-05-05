package inheritanceOdev;

public class Main {
	public static void main(String[] args) {
	
		UserManager userManager1 = new UserManager();
		userManager1.add(new Instructor("Murat","0546216512","mrtsvs7@gmail.com","111111"));
		userManager1.add(new Student("Ravza", "046785162", "ranza@gmail.com", "90731645"));
		System.out.println("");
		
//		UserManager userManager2 = new InstructorManager();  // alttakiyle aynı işi yapıyor.
		InstructorManager userManager2 = new InstructorManager();
		userManager2.add(new Instructor("Aslı", "034658795", "@hadiordan", "5468792"));
		UserManager userManager3 = new StudentManager();
		userManager3.add(new Student());
		System.out.println("");
		
		UserManager userManager4 = new UserManager();
		User[] users = new User[] {new Instructor("kadir","05538029981","bilmiyom","89745632"), new Student()};
		for(User user:users) {
			userManager4.add(user);
		}
	}
}
