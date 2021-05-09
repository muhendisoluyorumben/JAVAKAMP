import java.util.ArrayList;

public class GameManager implements GameManagerDao{
	
	ArrayList<String> buyedGames=new ArrayList<String>();
	
	
	@Override
	public void buyGame(Customer customer,Game game) {
		if(customer!=null) { // bu giri� yap�lm��sa anlam�na geliyor. yani ki�i null de�ilse, ki�i var ise
			if(this.buyedGames.size()==0 || this.buyedGames.get(0)!=customer.getFirstName()) { // listenin boyutu s�f�r ya da listedeki ki�inin ismiyle bize g�nderilen ki�i ayn� ki�i de�ilse ki�inin ismiyke beraber oyunu ekliyoruz.
				this.buyedGames.add(customer.getFirstName());
				this.buyedGames.add(game.getName());
				System.out.println(customer.getFirstName()+" kulan�c� "+game.getName()+" oyunu sat�n ald�.  Fiyat: "+game.getPrice());
				
			}else { // listede ki�i yoksa ya da ki�i ayn�ysa sadece oyunu ekliyor.
				this.buyedGames.add(game.getName());
				System.out.println(customer.getFirstName()+" kulan�c� "+game.getName()+" oyunu sat�n ald�.  Fiyat: "+game.getPrice());
			}
		}else { // ki�i yoksa �al���r
			System.out.println("Giri� yap�lmad���ndan dolay� oyun sat�n alma i�lemi ger�ekle�miyor");
		}	
	}

	
	
	@Override
	public void restituteGame(Customer customer, Game game) {
		System.out.println(game.getName()+" iade i�lemi yap�l�yor");
		for(int i=0;i<buyedGames.size();i++) {
			if(game.getName()==buyedGames.get(i)) {
				buyedGames.remove(i); // bize g�nderilen oyunun ismini liste i�inden bulup listeden kald�r�yoruz.
			}
		}
		System.out.print ("Kullan�c� ve sahip oldu�u oyunlar:  ");
		for(String gameName:buyedGames) {
			System.out.print(" "+gameName);
		}
		System.out.println("");
	}
	

}
