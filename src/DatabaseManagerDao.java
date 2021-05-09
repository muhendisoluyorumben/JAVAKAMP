import java.rmi.RemoteException;

public interface DatabaseManagerDao { // Her manager ýn bir interface i olmak zorunda. ilerde kullanýlacak.
	public void addDatabase(Customer customer)throws RemoteException;
}
