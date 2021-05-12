package inheritance2;

public class CostumerManager {
	public void add(Logger logger) {// müþteri ekleme kodlarý
		
		System.out.println("Müþteri eklendi");
		//DatabaseLogger logger =new DatabaseLogger();  // bu þekilde yapýlmamalý
		logger.log();
		
		
	}
}
