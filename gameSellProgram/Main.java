import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		
		
		Customer customer =new Customer(Long.parseLong("31213758426"),"Murat","�ahin",2002); 
		
		CustomerManager customerManager=new CustomerManager();
		
		Game game1=new Game("NFS","Car Race",120.0);
		Game game2=new Game("COD","War",500.0);
		
		GameManager gameManager=new GameManager();
		
		CampaignManager campaignManager=new CampaignManager();
		
		
		campaignManager.campaingCreat(new CampaignSummer("Yaz �enli�i", 0.23));  // kampanya entegrasyonu
		campaignManager.campaignUpgrade("Yaz �enli�i", 0.18); // kampanya g�ncellemesi
		
		campaignManager.campaingCreat(new CampaignSummer("K�� �enli�i", 0.30)); // yeni kampanya entegrasyonu
		campaignManager.campaignUpgrade("K�� �enli�i","G�ncel K��", 0.15); // kampanya g�ncellemesi
		customerManager.addCustomer(customer); // kay�t i�lemi
		customerManager.signInCustomer(customer);  // giri� i�lemi
		
		
		gameManager.buyGame(customer,game1); // oyun sat�n alma i�lemi
		campaignManager.activeCampaign(game1,0);  // kampanya aktivasyonu
		gameManager.buyGame(customer,game1);
		campaignManager.activeCampaign(game2,1);
		gameManager.buyGame(customer,game2);
		
		gameManager.restituteGame(customer,game1); // oyun iade etme i�lemi
		gameManager.restituteGame(customer,game2);
		
		customer =customerManager.signOutCustomer(customer);  // hesap ��k�� i�lemi
		gameManager.buyGame(customer,game1); // tekrar oyun alma iste�i g�nderiliyor. Amma m��teri ��k�� yapt���ndan dolay� oyun sat�n alamaz
		
		
		campaignManager.campaignDelete("Yaz �enli�i"); // kampanya silme
	}	
		
		
		
}



