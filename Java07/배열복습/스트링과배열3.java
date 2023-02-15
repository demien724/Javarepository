package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String s = " 011-245-1234 ";
		System.out.println(s);

		// 1번 문제
		// 공백 제거
		String str01 = s.trim();

		// 2번 문제
		// 구분 제거
		String[] str02 = str01.split("-");

		// 3번 문제
		// 
		String str03 = "";
		switch (str02[0]) {
		case "011":
			str03 = "SK";
			break;
		case "019":
			str03 = "LG";
		default:
			str03 = "Apple";
			break;
		}
		System.out.println(str03);

		// 4번 문제
		if (str02[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		// 5번 문제
		String str04 = "";
		for (int i = 0; i < str02.length; i++) {
			str04 = str04.concat(str02[i]);
		}

		if (str04.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		
		/////////////////////////
		System.out.println(str01);
		String strTest = str01.replace("-","");
		System.out.println(strTest);
	}

}
