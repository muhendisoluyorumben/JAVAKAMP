
public class NeroCustomerManager implements BaseCustomerManager{

	@Override
	public void add(BaseCustomer customer) {
		System.out.println("Nero ya kay�t edildi : "+customer.getFirstName());
	}

}
