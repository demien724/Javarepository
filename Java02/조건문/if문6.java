package 조건문;

import java.util.Date;

public class if문6 {
	public static void main(String[] args) {
		Date date = new Date();

		int year = date.getYear() + 1900; // 몇 년도
		int month = date.getMonth() + 1; // 몇월
		int day = date.getDay(); // 무슨 요일

		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요.");
		}else {
			System.out.println("밀레니엄 세대가 아니시군요.");
		}
		
		switch (day) {
		case 0:
		case 6:
			System.out.println("휴식합시다.");
			break;
		default:
			System.out.println("공부합시다.");
			break;
		}
		
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
	}
}
