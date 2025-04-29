package workshop.book.control;

import workshop.book.entity.Magazine;

import workshop.book.entity.Novel;
import workshop.book.entity.Publication;
import workshop.book.entity.ReferenceBook;

public class ManageBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publication[] pubs = new Publication[5];
		
		pubs[0] = new Magazine("마이크로소프트","2007-10-01",328,9900,"매월");
		pubs[1] = new Magazine("경영과컴퓨터","2007-10-03",316,9000,"매월");
		pubs[2] = new Novel("빠삐용","2007-07-01",396,9800,"베르나르베르베르","현대소설");
		pubs[3] = new Novel("남한산성","2007-04-14",383,11000,"김훈","대하소설");
		pubs[4] = new ReferenceBook("실용주의프로그래머","2007-01-14",496,25000,"소프트웨어공학");
		
		for (Publication publication : pubs) {
			System.out.println(publication);
		}
		
		System.out.println("=== 가격변경 전 ===");
		Publication pub2 = pubs[2];
		System.out.println(pub2.getTitle() + " = " + pub2.getPrice());
		
		modifyPrice(pubs[2]);
		System.out.println("=== 가격변경 후 ===");
		System.out.println(pub2.getTitle() + " = " + pub2.getPrice());
		
		for (Publication publication : pubs) {
			printSubInfo(publication);
			
		}
		
//		Magazine mz = new Magazine();
//		Publication pub = new Magazine();
//		
//		Novel novel = new Novel();
//		Publication pub2 = new Novel();
	}
	
	public static void printSubInfo(Publication pub) {
		if (pub instanceof Magazine) {
			Magazine m = (Magazine)pub;
			System.out.println(m.getPublishingPeriod());
		}else if(pub instanceof Novel) {
			Novel m = (Novel)pub;
			System.out.println(m.getPublishingDate());
		}else if(pub instanceof ReferenceBook) {
			ReferenceBook m = (ReferenceBook)pub;
			System.out.println(m.getPublishingDate());
		}
	}
	
	public static void modifyPrice(Publication pub) {
		double rate = 0.0;
		if(pub instanceof Magazine) {
			rate = 0.6;
		}
		if(pub instanceof Novel) {
			rate = 0.8;
		}
		if(pub instanceof ReferenceBook) {
			rate = 0.9;
		}
		
		pub.setPrice((int)(pub.getPrice() * rate));
	}

}
