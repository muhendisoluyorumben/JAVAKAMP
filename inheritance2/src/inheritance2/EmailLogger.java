package inheritance2;

public class EmailLogger extends Logger{ // sen bir Logger s�n
	@Override
	public void log() {
		System.out.println("Email Yolland�");
	}
}
