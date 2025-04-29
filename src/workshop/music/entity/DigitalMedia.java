package workshop.music.entity;

public class DigitalMedia extends MusicMedia {
	protected String format;

	public DigitalMedia(String title, String artist, String format) {
		super(title, artist);
		// TODO Auto-generated constructor stub
		this.format = format;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		displayInfo();
	}
	

}
