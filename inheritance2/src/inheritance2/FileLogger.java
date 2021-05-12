package inheritance2;

public class FileLogger extends Logger{// sen bir Logger sýn
	@Override
	public void log() {
		System.out.println("File Loglandý");
	}
}
