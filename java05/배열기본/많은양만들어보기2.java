package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] score2 = new int[999];
		
		Random r = new Random();
		
		int sum = 0;			// 3이상인 변수들의 합
		int count = 0;			// 3이상인 변수의 갯수
		
		for (int i = 0; i < score2.length; i++) {
			
			score2[i] = r.nextInt(19) + 2;		// 2 ~ 20사이의 값
														// nextInt( 20 - 2 + 1 ) 
			System.out.println(i + " : " + score2[i]);
			
			if(score2[i] >=15 ) {
				count = count + 1;
				sum = sum + score2[i];
				
			}
		}
		
		System.out.println("3이상의 수는 " + count +"개");
		System.out.println("3이상의 수의 합계는 " + sum);
	}

}
