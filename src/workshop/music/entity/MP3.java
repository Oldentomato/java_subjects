package workshop.music.entity;

public class MP3 extends DigitalMedia implements Playable {
	private int fileSize;
	private int volume;
	
	
	public MP3(String title, String artist, int fileSize, int volume) {
		super(title, artist ,"MP3");
		// TODO Auto-generated constructor stub
		this.fileSize = fileSize;
		this.volume = volume;
	}
	
//	public MP3(String title) {
//		super();
//	}

	@Override
	public void setVolume(int level) {
		// TODO Auto-generated method stub
		this.volume = level;
		System.out.println(String.format("������ %s�� �����Ǿ����ϴ�.", this.volume));
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("MP3 ����� �����Ǿ����ϴ�.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		displayInfo();
		System.out.println("����:"+this.format);
		System.out.println("���� ũ��:"+fileSize+"MB");
		System.out.println(String.format("%s������ '%s'��(��) �����з� ����˴ϴ�.", this.format, this.title));
		System.out.println("���� ����: "+this.volume);
	}
	


}
