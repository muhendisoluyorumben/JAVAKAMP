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
			kontrol++;// kontol de�i�keni olu�turuyoruz ve bize g�nderilen ki�inin maili bizim listemizde varsa kontrol de�i�kenin art�r�yoruz
				break;
			}
		}
		
		
		if (matchMail.find() && matchPassword.find() && kontrol == 0) {
			System.out.println("E posta ve �ifre kabul edilebilir : "+user.geteMail()+"  "+user.getPassword());
			if(user.getFirstName().length()<2||user.getLastName().length()<2) {
				System.err.println("�sim ve Soyisim uzunlu�u 2 karakterden fazla olmal�d�r");
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
				System.err.println("Uzunlu�u 6 karakter olan b�y�k-k���k harf ve say�lardan olu�an bir �ifre giriniz.");
				this.information.messageFailed();
			} else {
				System.err.println("�zg�n bir e-posta adresi giriniz.");
				this.information.messageFailed();
			}
		}
	}
}
