package inheritance2;

public class Main {
 
	public static void main(String[] args) {
		// birbirinin alternetifi için if yazýlmaz
		
		
		CostumerManager costumerManager=new CostumerManager();
		costumerManager.add(new EmailLogger());
		costumerManager.add(new DatabaseLogger());
		
	}

}
