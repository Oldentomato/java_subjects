package workshop.music.entity;

public class Vinyl extends MusicMedia {
	private int rpm;
	
	public Vinyl(String title, String artist, int rpm) {
		super(title,artist);
		this.rpm = rpm;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		displayInfo();
		System.out.println(String.format("회전 속도: %s rpm", this.rpm));
		System.out.println(String.format("바이닐 레코드 '%s'이(가) %srpm으로 재생됩니다.", this.title, this.rpm));
	}
	
	public void clean() {
		System.out.println("바이닐 레코드를 청소합니다.");
	}

}
