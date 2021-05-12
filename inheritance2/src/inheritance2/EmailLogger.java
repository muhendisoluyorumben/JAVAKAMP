package inheritance2;

public class EmailLogger extends Logger{ // sen bir Logger sýn
	@Override
	public void log() {
		System.out.println("Email Yollandý");
	}
}
