import java.rmi.RemoteException;
import java.util.ArrayList;

public class CustomerManager implements CustomerManagerDao{
	
	ArrayList<Customer> customers=new ArrayList<Customer>();
	
	
	@Override
	public void addCustomer(Customer customer) throws RemoteException{
		DatabaseManager databaseManager=new DatabaseManager();
		this.customers.add(customer); // listemize kullan�c�y� ek�yoruz.
		databaseManager.addDatabase(customer);
	}
	
	
	
	@Override
	public void signInCustomer(Customer customer) {
		int sayac=0;
		for(Customer custom : customers) {
			if(custom.getId()==customer.getId()) {
			System.out.println("Giri� yap�ld� :"+custom.getFirstName());
			sayac++;
			}
		}
		if(sayac==0) {
			System.out.println("Hatal� Bilgi ya da Kay�t Yok");
		}
	}

	

	@Override
	public Customer signOutCustomer(Customer customer) { // hesaptan ��k�� yapt���m�zdan dolay� nesneyi null hale getiriyoruz.
		this.customers.remove(customer);
		System.out.println("Hesaptan ��k�� i�lemi tamamland�");
		customer=null;
		return customer;
	}


}
