import java.rmi.RemoteException;
import java.util.ArrayList;

public class CustomerManager implements CustomerManagerDao{
	
	ArrayList<Customer> customers=new ArrayList<Customer>();
	
	
	@Override
	public void addCustomer(Customer customer) throws RemoteException{
		DatabaseManager databaseManager=new DatabaseManager();
		this.customers.add(customer); // listemize kullanýcýyý ekþyoruz.
		databaseManager.addDatabase(customer);
	}
	
	
	
	@Override
	public void signInCustomer(Customer customer) {
		int sayac=0;
		for(Customer custom : customers) {
			if(custom.getId()==customer.getId()) {
			System.out.println("Giriþ yapýldý :"+custom.getFirstName());
			sayac++;
			}
		}
		if(sayac==0) {
			System.out.println("Hatalý Bilgi ya da Kayýt Yok");
		}
	}

	

	@Override
	public Customer signOutCustomer(Customer customer) { // hesaptan çýkýþ yaptýðýmýzdan dolayý nesneyi null hale getiriyoruz.
		this.customers.remove(customer);
		System.out.println("Hesaptan çýkýþ iþlemi tamamlandý");
		customer=null;
		return customer;
	}


}
