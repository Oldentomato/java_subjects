package workshop.music.entity;

public abstract class MusicMedia {
	protected String title;
	protected String artist;
	
	
	protected MusicMedia(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	public abstract void play();
	public void displayInfo() {
		System.out.println(String.format("제목:%s, 아티스트:%s", this.title, this.artist));
	}
}
