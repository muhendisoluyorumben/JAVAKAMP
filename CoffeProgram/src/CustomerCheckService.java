
public class CustomerCheckService implements CustomerCheckDao{

	@Override
	public boolean CustomerCheck(BaseCustomer customer) {
		if(customer.getIdentity()=="31213758426") {
			return true;
		}else
		{
			return false;
		}
	}

}
