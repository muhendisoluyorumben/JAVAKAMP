package inheritanceOdev;

public class Student extends User{
	private String studentNumber;

	public Student() {
		this.studentNumber="default student number";
	}
	public Student(String name,String phoneNumber,String mail,String studentNumber) {
		super(name,phoneNumber,mail);
		this.studentNumber=studentNumber;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
