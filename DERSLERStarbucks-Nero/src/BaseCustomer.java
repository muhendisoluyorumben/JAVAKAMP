
public class BaseCustomer {
	private String firstName;
	private String lastName;
	private String birthday;
	private String ýdentity;
	
	public BaseCustomer(String firstName,String lastName,String birthday,String ýdentity) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthday=birthday;
		this.ýdentity=ýdentity;
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
		return ýdentity;
	}
	public void setIdentity(String identity) {
		ýdentity = identity;
	}
}
