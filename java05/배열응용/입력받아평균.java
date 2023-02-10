package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러개 받아서
		// 저장공간에 넣고 싶을 때 >> 배열을 사용
		
		int[] score = new int[5];
		
		// 배열에 값을 넣을 때는 index가 필요
		for (int i = 0; i < score.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			score[i] = Integer.parseInt(data);
		}
		
		for (int i : score) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		// 1. 합계 구해서, 평균을 구하기
		double sum = 0;
		double result = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		result = sum / score.length;
		System.out.println("해당 값들의 평균은 >> " + result);
		
		
		// 2. 300이상 되는 숫자만 찾아서 합계를 구하기
		int sum2 = 0;
		for (int i = 0; i < score.length; i++) {
			if(score[i] >= 300) {
				sum2 = sum2 + score[i];
			}
		}
		System.out.println("300이상의 값들의 합은 >> " + sum2);
		
		// 3. 심화문제, 300이상 되는 위치인 index를 print
		int[] over300 = new int[score.length];		//	300이상의 인덱스를 추가
		int seq = 0;											// 순서
		
		for (int i = 0; i < score.length; i++) {
			if(score[i] >= 300) {
				over300[seq] = i;
				seq = seq + 1;
			}
		}

		System.out.print("300이상의 숫자들의 위치(인덱스)는 >> ");
		for (int j = 0; j < seq; j++) {
			System.out.print( over300[j] + " ");
		}
		
	}

}
