import java.rmi.RemoteException;

public class DatabaseManager implements DatabaseManagerDao{
	
	Customer customer;
	
	@Override
	public void addDatabase(Customer customer) throws RemoteException  {
		Verification verification=new Verification();
		this.customer=customer;
		if(verification.Control(customer)) {
			System.out.println("Do�ruland�.");
			System.out.println("Kay�t tamamland� : "+customer.getFirstName());
			
		}else {
			System.out.println("Ger�ek ki�i de�il!!!");
		}
	}

}

