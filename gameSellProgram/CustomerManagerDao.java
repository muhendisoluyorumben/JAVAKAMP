import java.rmi.RemoteException;

public interface CustomerManagerDao {

	public void addCustomer(Customer customers) throws RemoteException;
	public void signInCustomer(Customer customer);
	public Customer signOutCustomer(Customer customer);
}
