package 조건문;

import java.util.Date;

public class if문4 {
	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date.getYear()+1900);			// date.getYear()은 1900년을 기준으로 카운트됨
		System.out.println(date.getMonth() + 1);			// date.getMonth()는 0부터 시작함
		System.out.println(date.getDate());
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		System.out.println(date.getDay());					// 0부터 시작, 0 = 일요일
		
		int hour = date.getHours();
//		int hour = 15;

		if (hour < 11) {
			System.out.println("굿 모닝");
		} else if (hour < 14) {
			System.out.println("굿 애프터눈");
		} else if (hour < 20) {
			System.out.println("굿 이브닝");
		} else {
			System.out.println("굿 나잇");
		}

		int month = date.getMonth() + 1;
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;

		default:
			break;
		}
	}
}
