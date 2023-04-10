package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n1 = new int[5];

		for (int i = 0; i < n1.length; i++) {
			n1[i] = sc.nextInt();
		}

		int min = n1[0];
		for (int i = 0; i < n1.length; i++) {
			if (min > n1[i]) {
				min = n1[i];
			}
		}
		System.out.println(min);

		// 2번 문제
		Random r = new Random();
		int[] n2 = new int[20];

		for (int i = 0; i < n2.length; i++) {
			n2[i] = r.nextInt(900);
		}

		int max = n2[0];
		for (int i = 0; i < n2.length; i++) {
			if (max < n2[i]) {
				max = n2[i];
			}
		}
		System.out.println(max);

		// 3번 문제
		String s1 = "참 좋다";
		String s2 = "진짜 좋다";

		System.out.println(s1.equals(s2));
		if (s1.length() > s2.length()) {
			System.out.println("s1이 더 큽니다.");
		} else if (s1.length() == s2.length()) {
			System.out.println("s1과 s2가 같습니다.");
		} else {
			System.out.println("s2가 더 큽니다.");
		}

		// 4번 문제
		String s3 = "나는 진짜 java programmer입니다.";
		System.out.println(s3.substring(s3.lastIndexOf("java"),s3.lastIndexOf("programmer")).toUpperCase());
			
		// 5번 문제
		String s4 = "2056521";
		if (s4.startsWith("1")) {

			System.out.println("남자");
		} else if(s4.startsWith("2")) {
			System.out.println("여자");
		} else {
			System.out.println("기타");
		}
		
		
		// 6번 문제
		String s5 = "[ 10,20,30,40,50]";
		s5 = s5.replace("]", "");
		s5 = s5.replace("[", "");
		s5 = s5.trim();
		
		String[] s6 = s5.split(",");
		int[] n3 = new int[s6.length];
		
		for (int i = 0; i < n3.length; i++) {
			n3[i] = Integer.parseInt(s6[i]);
		}
		
		Arrays.sort(n3);
		for (int i = 0; i < n3.length; i++) {
			System.out.print(n3[i] + " ");
		}
			
	}

}
