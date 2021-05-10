package information.concretes;

import information.abstracts.InformationService;

public class EmailInformation implements InformationService{

	@Override
	public void messageSuccess() {
		System.out.println("Doðrulama linki");
		System.out.printf("Bilgilendirme Mesajý : Kullanýcý baþarýyla kayýt oldu\n____________________________\n");	
		System.out.println();
	}

	@Override
	public void messageFailed() {
		System.out.printf("Bilgilendirme Mesajý : Kullanýcý kaydý yapýlamadý\n____________________________\n");
	}

}
