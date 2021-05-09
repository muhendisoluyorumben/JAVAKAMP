import java.util.ArrayList;

public class GameManager implements GameManagerDao{
	
	ArrayList<String> buyedGames=new ArrayList<String>();
	
	
	@Override
	public void buyGame(Customer customer,Game game) {
		if(customer!=null) { // bu giriþ yapýlmýþsa anlamýna geliyor. yani kiþi null deðilse, kiþi var ise
			if(this.buyedGames.size()==0 || this.buyedGames.get(0)!=customer.getFirstName()) { // listenin boyutu sýfýr ya da listedeki kiþinin ismiyle bize gönderilen kiþi ayný kiþi deðilse kiþinin ismiyke beraber oyunu ekliyoruz.
				this.buyedGames.add(customer.getFirstName());
				this.buyedGames.add(game.getName());
				System.out.println(customer.getFirstName()+" kulanýcý "+game.getName()+" oyunu satýn aldý.  Fiyat: "+game.getPrice());
				
			}else { // listede kiþi yoksa ya da kiþi aynýysa sadece oyunu ekliyor.
				this.buyedGames.add(game.getName());
				System.out.println(customer.getFirstName()+" kulanýcý "+game.getName()+" oyunu satýn aldý.  Fiyat: "+game.getPrice());
			}
		}else { // kiþi yoksa çalýþýr
			System.out.println("Giriþ yapýlmadýðýndan dolayý oyun satýn alma iþlemi gerçekleþmiyor");
		}	
	}

	
	
	@Override
	public void restituteGame(Customer customer, Game game) {
		System.out.println(game.getName()+" iade iþlemi yapýlýyor");
		for(int i=0;i<buyedGames.size();i++) {
			if(game.getName()==buyedGames.get(i)) {
				buyedGames.remove(i); // bize gönderilen oyunun ismini liste içinden bulup listeden kaldýrýyoruz.
			}
		}
		System.out.print ("Kullanýcý ve sahip olduðu oyunlar:  ");
		for(String gameName:buyedGames) {
			System.out.print(" "+gameName);
		}
		System.out.println("");
	}
	

}
