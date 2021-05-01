package inheritanceOdev;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.name+" eklendi. Branþý:  "+instructor.getInstructorBranch()+" tel no: "+instructor.phoneNumber+" mail: "+instructor.mail);
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.name+" kaldýrýldý");
	}
}
