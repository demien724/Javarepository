package 배열복습;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class 배열정렬순위 {
	public static void main(String[] args) {
		// 배열을 정렬 할때는 Array << 사용
		Random r = new Random(42);
		
		int[] score = new int[10000];
		
		//	for문 : 출력, 입력 둘 다 가능합니다.
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(1000) + 1;
		}
		
		
		// Foreach문 : 출력만 가능합니다.
		for (int i : score) {
			System.out.println(i);
		}
		
		Arrays.sort(score);
		
		String str = JOptionPane.showInputDialog("숫자 입력");
		int n1= Integer.parseInt(str);
		
		for (int i : score) {
			System.out.println(i);
		}	// 정렬 후 확인
		
		System.out.println("score의 최소값 : " + score[0]);
		System.out.println("score의 최대값 : " + score[score.length - 1]);
		
		int sum30 = 0;
		for (int i = 7000; i < score.length; i++) {
			sum30 = sum30 + score[i];
		}
		
		System.out.println("상위 30%  " + sum30/3000.0);
		
		// 하위 30%의 평균
		int sum2 = 0;
		for (int i = 0; i < (score.length*0.3); i++) {
			sum2 = sum2 + score[i];
		}
		
		System.out.println("하위 30% : " + sum2/3000.0);
		
	}
}
