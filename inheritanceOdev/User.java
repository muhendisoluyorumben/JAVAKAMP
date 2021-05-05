

public class User {
	private String name;
	private String phoneNumber;
	private String mail;
	
	public User() {
		this.name="Default Name";
	}
	
	public User(String name,String phoneNumber,String mail) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.mail=mail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
