/*Senaryo:
Kahve d�kkanlar� i�in m��teri y�netim sistemi.
Starbucs ve Nero i�in �al���yoruz.
�kisi de m��terileri veritaban�na kaydetmek istiyor.
Starbucs kaydederken mernis do�rulamas� istiyor. Nero istemiyor.
*/

//07.05.2021
public class Main {

	public static void main(String[] args) {
		BaseCustomer customer=new BaseCustomer("Murat", "�ahin", "18,6,2002", "31213758426");
		BaseCustomerManager customerManager =new StarbucksCustomerManager();
		customerManager.add(customer);
		
		
	}

}
