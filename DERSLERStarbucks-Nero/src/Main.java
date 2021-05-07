/*Senaryo:
Kahve dükkanlarý için müþteri yönetim sistemi.
Starbucs ve Nero için çalýþýyoruz.
Ýkisi de müþterileri veritabanýna kaydetmek istiyor.
Starbucs kaydederken mernis doðrulamasý istiyor. Nero istemiyor.
*/

//07.05.2021
public class Main {

	public static void main(String[] args) {
		BaseCustomer customer=new BaseCustomer("Murat", "Þahin", "18,6,2002", "31213758426");
		BaseCustomerManager customerManager =new StarbucksCustomerManager();
		customerManager.add(customer);
		
		
	}

}
