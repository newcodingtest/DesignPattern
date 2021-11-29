package SingleTone_Pattern;

public class SystemSpeaker {
	
	static private SystemSpeaker instance;
	private int volume;
	
	private SystemSpeaker() {
		volume = 5;
	}
	
	public static SystemSpeaker getInstance() {
		if(instance == null) {	
			
			instance = new SystemSpeaker();
			System.out.println("���� ����");
		}else {
			System.out.println("�̹� ����");
		}
		return instance;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
