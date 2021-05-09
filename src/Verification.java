import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Verification {
	Customer customer;
	
	public boolean Control(Customer customer) throws RemoteException {
		this.customer=customer;
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		return kpsPublicSoapProxy.TCKimlikNoDogrula(customer.getId(), customer.getFirstName(), customer.getLastName(), customer.getDate());	
	}
}
