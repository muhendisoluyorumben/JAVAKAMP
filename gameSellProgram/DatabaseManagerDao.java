import java.rmi.RemoteException;

public interface DatabaseManagerDao { // Her manager �n bir interface i olmak zorunda. ilerde kullan�lacak.
	public void addDatabase(Customer customer)throws RemoteException;
}
