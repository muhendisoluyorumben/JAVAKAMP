import java.rmi.RemoteException;

public class DatabaseManager implements DatabaseManagerDao{
	
	Customer customer;
	
	@Override
	public void addDatabase(Customer customer) throws RemoteException  {
		Verification verification=new Verification();
		this.customer=customer;
		if(verification.Control(customer)) {
			System.out.println("Doðrulandý.");
			System.out.println("Kayýt tamamlandý : "+customer.getFirstName());
			
		}else {
			System.out.println("Gerçek kiþi deðil!!!");
		}
	}

}

