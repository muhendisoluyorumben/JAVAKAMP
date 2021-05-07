
public class StarbucksCustomerManager implements BaseCustomerManager{

	
	@Override
	public void add(BaseCustomer customer) {
		CustomerCheckService customerCheckService=new CustomerCheckService();
		if(customerCheckService.CustomerCheck(customer)) {
			System.out.println("Starbucs veritaban�na eklendi "+customer.getFirstName());
		}else {
			System.out.println("B�yle bir ki�i yok");
		}
	}

}
