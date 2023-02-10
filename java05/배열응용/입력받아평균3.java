package 배열응용;

import java.util.Scanner;


public class 입력받아평균3 {
	public static void main(String[] args) {
		// 1번 문제
		Scanner sc = new Scanner(System.in);
		int[] arry1 = new int[5];
		
		for (int i = 0; i < arry1.length; i++) {
			System.out.print((i+1) + "번째 값을 입력하세요 >> ");
			arry1[i] = sc.nextInt();
		}
		int sum1 = arry1[0] + arry1[2];
		System.out.println(sum1);
		System.out.println();
		
		// 2번 문제
		String[] arry2 = new String[3];
		
		for (int i = 0; i < arry2.length; i++) {
			System.out.print((i+1) + "번째 >> ");
			arry2[i] = sc.next();	
		}
		
		System.out.println(arry2[0] + " 보다는 " + arry2[1]);
		sc.close();
	}
	

}
