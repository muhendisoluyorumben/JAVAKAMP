package inheritance2;

public class CostumerManager {
	public void add(Logger logger) {// m��teri ekleme kodlar�
		
		System.out.println("M��teri eklendi");
		//DatabaseLogger logger =new DatabaseLogger();  // bu �ekilde yap�lmamal�
		logger.log();
		
		
	}
}
