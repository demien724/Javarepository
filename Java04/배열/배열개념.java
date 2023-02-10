package 배열;

public class 배열개념 {
	public static void main(String[] args) {
//		1. 값을 미리 알고있는 경우
		int[] score = {10, 20, 30, 40};
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println("전체 개수 " + score.length);	// 이 주소가 가르키는 length변수
		
		score[0] = 100;
		System.out.println(score[0]);
		
//		2. 값을 모르는 경우, 미리 저장공간을 만들어 놓는 경우
		int[] score2 = new int[4];
		score2[0] = 200;
		System.out.println(score2[0]);
	}
}
