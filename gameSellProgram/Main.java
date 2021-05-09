import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		
		
		Customer customer =new Customer(Long.parseLong("31213758426"),"Murat","Þahin",2002); 
		
		CustomerManager customerManager=new CustomerManager();
		
		Game game1=new Game("NFS","Car Race",120.0);
		Game game2=new Game("COD","War",500.0);
		
		GameManager gameManager=new GameManager();
		
		CampaignManager campaignManager=new CampaignManager();
		
		
		campaignManager.campaingCreat(new CampaignSummer("Yaz Þenliði", 0.23));  // kampanya entegrasyonu
		campaignManager.campaignUpgrade("Yaz Þenliði", 0.18); // kampanya güncellemesi
		
		campaignManager.campaingCreat(new CampaignSummer("Kýþ Þenliði", 0.30)); // yeni kampanya entegrasyonu
		campaignManager.campaignUpgrade("Kýþ Þenliði","Güncel Kýþ", 0.15); // kampanya güncellemesi
		customerManager.addCustomer(customer); // kayýt iþlemi
		customerManager.signInCustomer(customer);  // giriþ iþlemi
		
		
		gameManager.buyGame(customer,game1); // oyun satýn alma iþlemi
		campaignManager.activeCampaign(game1,0);  // kampanya aktivasyonu
		gameManager.buyGame(customer,game1);
		campaignManager.activeCampaign(game2,1);
		gameManager.buyGame(customer,game2);
		
		gameManager.restituteGame(customer,game1); // oyun iade etme iþlemi
		gameManager.restituteGame(customer,game2);
		
		customer =customerManager.signOutCustomer(customer);  // hesap çýkýþ iþlemi
		gameManager.buyGame(customer,game1); // tekrar oyun alma isteði gönderiliyor. Amma müþteri çýkýþ yaptýðýndan dolayý oyun satýn alamaz
		
		
		campaignManager.campaignDelete("Yaz Þenliði"); // kampanya silme
	}	
		
		
		
}



