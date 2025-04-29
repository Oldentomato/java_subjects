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
		System.out.println(String.format("ȸ�� �ӵ�: %s rpm", this.rpm));
		System.out.println(String.format("���̴� ���ڵ� '%s'��(��) %srpm���� ����˴ϴ�.", this.title, this.rpm));
	}
	
	public void clean() {
		System.out.println("���̴� ���ڵ带 û���մϴ�.");
	}

}
