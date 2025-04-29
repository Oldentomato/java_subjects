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
		System.out.println(String.format("볼륨이 %s로 설정되었습니다.", this.volume));
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("MP3 재생이 중지되었습니다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		displayInfo();
		System.out.println("포맷:"+this.format);
		System.out.println("파일 크기:"+fileSize+"MB");
		System.out.println(String.format("%s형식의 '%s'이(가) 디지털로 재생됩니다.", this.format, this.title));
		System.out.println("현재 볼륨: "+this.volume);
	}
	


}
