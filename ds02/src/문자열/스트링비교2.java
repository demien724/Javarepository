package 문자열;

import java.util.ArrayList;

public class 스트링비교2 {
	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		
		// 1번 문제
		String[] all2 = all.split(",");
		
		// 2번 문제
		for (int i = 0; i < all2.length; i++) {
			all2[i] = all2[i].trim();
		}
		
		// 3번 문제
		System.out.println("과목 수는 " + all2.length + "개");
		
		// 4번 문제
		
		// 컴퓨터의 순서를 저장하기 위한 변수를 선언
		int seq = 0;
		
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].equals("컴퓨터")) {
				seq = i;
			}
		}
		
		System.out.println("컴퓨터 과목의 위치는 " + seq);
		
		// 5번 문제
		
		// 3글자 미만의 과목수를 저장하기 위한 변수 선언 
		int count = 0;
		
		for (int j = 0; j < all2.length; j++) {
			if(all2[j].length()<3) {
				count++;
			}
		}
		System.out.println("3글자 미만의 과목수는 " + count);
		
		/*
		 * List<String> list = Arrays.asList(all2);
		 * 	System.out.println(list.indexOf("컴퓨터");
		 */
		
		ArrayList list2 = new ArrayList();
	}
}
