package inheritanceOdev;

public class Main {
	public static void main(String[] args) {
	
		
		Instructor instructor1 =new Instructor("Fizik");
		instructor1.name="Engin";
		instructor1.mail="eng@gmail";
		instructor1.phoneNumber="123345";
		
		InstructorManager insMan=new InstructorManager();
		insMan.add(instructor1);
		insMan.delete(instructor1);
	}
	
}
