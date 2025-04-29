package workshop.music.control;

import workshop.music.entity.*;

public class MusicPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vinyl vin = new Vinyl("Yesterday", "The Beatles", 33);
		MP3 mp3 = new MP3("Dynamite","BTS",5,5);
		
		MusicMedia musicMp3 = new MP3("Butter","BTS",4,5);
		
		System.out.println("===���� ��� �ý��� �׽�Ʈ===\n");
		
		System.out.println("--- MP3 �׽�Ʈ ---");
		mp3.play();
		mp3.setVolume(8);
		mp3.play();
		mp3.stop();
		
		System.out.println("--- Vinyl �׽�Ʈ ---");
		vin.play();
		vin.clean();
		
		System.out.println("--- ������ �׽�Ʈ ---");
		musicMp3.play();
		
		System.out.println("--- ĳ���� �׽�Ʈ ---");
		MP3 castingMp3 = (MP3)musicMp3;
		
		castingMp3.setVolume(8);
		castingMp3.play();
		castingMp3.setVolume(7);
		castingMp3.stop();
	}

}
