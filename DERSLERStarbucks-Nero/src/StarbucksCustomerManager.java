
public class StarbucksCustomerManager implements BaseCustomerManager{

	
	@Override
	public void add(BaseCustomer customer) {
		CustomerCheckService customerCheckService=new CustomerCheckService();
		if(customerCheckService.CustomerCheck(customer)) {
			System.out.println("Starbucs veritabanýna eklendi "+customer.getFirstName());
		}else {
			System.out.println("Böyle bir kiþi yok");
		}
	}

}
