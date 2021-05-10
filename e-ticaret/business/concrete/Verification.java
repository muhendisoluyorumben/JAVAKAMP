package business.concrete;

import java.util.ArrayList;
import java.util.List;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import dataAccess.abstracts.UserDao;
import entities.concrete.User;
import information.abstracts.InformationService;
import information.concretes.EmailInformation;

public class Verification {
	
	Pattern patternMail = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
	Pattern patternPassword = Pattern.compile("[a-zA-Z0-9]{6}");
	InformationService information = new EmailInformation();


	public Verification() {
		// TODO Auto-generated constructor stub
	}


	public void verify(UserDao userDao,User user) {
		List<User> users = new ArrayList<User>();
		Matcher matchMail = patternMail.matcher(user.geteMail());
		Matcher matchPassword = patternPassword.matcher(user.getPassword());

		int kontrol = 0;
		for (User usersClone : users) {
			if (usersClone.geteMail() == user.geteMail()) {
			kontrol++;// kontol deðiþkeni oluþturuyoruz ve bize gönderilen kiþinin maili bizim listemizde varsa kontrol deðiþkenin artýrýyoruz
				break;
			}
		}
		
		
		if (matchMail.find() && matchPassword.find() && kontrol == 0) {
			System.out.println("E posta ve þifre kabul edilebilir : "+user.geteMail()+"  "+user.getPassword());
			if(user.getFirstName().length()<2||user.getLastName().length()<2) {
				System.err.println("Ýsim ve Soyisim uzunluðu 2 karakterden fazla olmalýdýr");
				this.information.messageFailed();
			}
			else {
				userDao.add(user);
				users.add(user);
				this.information.messageSuccess();
			}
		} else {
			if (kontrol == 0) {
				System.err.println("Kriterlere uygun bir e-posta adresi giriniz");
				System.err.println("Uzunluðu 6 karakter olan büyük-küçük harf ve sayýlardan oluþan bir þifre giriniz.");
				this.information.messageFailed();
			} else {
				System.err.println("Özgün bir e-posta adresi giriniz.");
				this.information.messageFailed();
			}
		}
	}
}
