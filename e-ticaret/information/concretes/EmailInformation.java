package information.concretes;

import information.abstracts.InformationService;

public class EmailInformation implements InformationService{

	@Override
	public void messageSuccess() {
		System.out.println("Do�rulama linki");
		System.out.printf("Bilgilendirme Mesaj� : Kullan�c� ba�ar�yla kay�t oldu\n____________________________\n");	
		System.out.println();
	}

	@Override
	public void messageFailed() {
		System.out.printf("Bilgilendirme Mesaj� : Kullan�c� kayd� yap�lamad�\n____________________________\n");
	}

}
