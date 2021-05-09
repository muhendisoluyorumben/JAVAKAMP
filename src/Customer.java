
public class Customer {
	private String  firstName , lastName ;
	private int date;
	private long id;
	
	public Customer() {
		
	}
	
	public Customer(long id, String firstName, String lastName, int date) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDate() {
		return date;
	}
	
}
