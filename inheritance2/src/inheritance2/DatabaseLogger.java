package inheritance2;

public class DatabaseLogger extends Logger{// sen bir Logger sýn
	@Override
	public void log() {
		System.out.println("Database Loglandý");
	}
}
