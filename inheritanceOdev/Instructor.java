package inheritanceOdev;

public class Instructor extends User{
	private String instructorNumber;
	
	public Instructor() {
		
	}
	public Instructor(String name,String phoneNumber,String mail,String instructorNumber) {
		super(name,phoneNumber,mail);
		this.instructorNumber=instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	
}
