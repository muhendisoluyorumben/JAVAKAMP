
public class BaseCustomer {
	private String firstName;
	private String lastName;
	private String birthday;
	private String �dentity;
	
	public BaseCustomer(String firstName,String lastName,String birthday,String �dentity) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthday=birthday;
		this.�dentity=�dentity;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getIdentity() {
		return �dentity;
	}
	public void setIdentity(String identity) {
		�dentity = identity;
	}
}
