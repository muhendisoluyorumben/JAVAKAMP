package inheritanceOdev;

public class Instructor extends User{
	private String instructorBranch;
	
	public Instructor(String instructorBranch) {
		this.instructorBranch=instructorBranch;
		
	}
	
	public void setInstructorBranch(String instructorBranch) {
		this.instructorBranch=instructorBranch;
	}
	public String getInstructorBranch() {
		return instructorBranch;
	}
}
