package 배열응용;

import java.util.Scanner;


public class 여러개배열사용하기2 {
	public static void main(String[] args) {
		String[] names = { "홍", "도", "아", "정", "김" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		int count1 = 0; // 1학기 성적이 오른 학생의 수
		int count2 = 0; // 1, 2학기 성적이 동일한 학생수

		int num3 = 0; // 2학기 성적 100점인 학생의 이름과 성적
		String name3 = "";

		int sum4_1 = 0;
		int sum4_2 = 0;

		for (int i = 0; i < term1.length; i++) {

			// 1번
			if (term1[i] < term2[i]) {
				count1++;
			}
			// 2번
			else if (term1[i] == term2[i]) {
				count2++;
			}

			// 3번
			if (term2[i] == 100) {
				num3 = i + 1;
				name3 = names[i];
			}

			// 4번
			sum4_1 += term1[i];
			sum4_2 += term2[i];
		}

		double avg1 = (double) sum4_1 / term1.length;
		double avg2 = (double) sum4_2 / term2.length;

		System.out.println("1학기 성적이 오른 학생의 수 >> " + count1 + "명");
		System.out.println("1, 2학기 성적이 동일한 학생수 >> " + count2 + "명");
		System.out.println("2학기 성적이 100점인 학생의 이름과 번호 >> " + name3 + ", " + num3);

		if (avg1 > avg2) {
			System.out.println("1학기 성적 평균이 더 높았습니다.");
		} else if (avg1 < avg2) {
			System.out.println("2학기 성적 평균이 더 높았습니다");
		} else {
			System.out.println("1학기 2학기 성적 평균이 같습니다.");
		}

		// 5번 홍, 도, 아, 정, 김
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 >> ");
		String str = sc.next();

		for (int i = 0; i < term1.length; i++) {
			if (names[i].equals(str)) {
				System.out.println("1학기 성적 : " + term1[i]);
				System.out.println("2학기 성적 : " + term2[i]);
				break;
			}
		}

		// 추가 문제 1번
		String[] tour1 = new String[3]; // 작년
		String[] tour2 = new String[3]; // 올해

		System.out.println("작년에 가고 싶었던 곳 세 곳을 입력해 주세요"); // 작년
		for (int i = 0; i < tour1.length; i++) {
			System.out.print((i + 1) + "순위 >> ");
			tour1[i] = sc.next();
		}
		System.out.println("=========");

		System.out.println("작년에 가고 싶었던 곳 세 곳을 입력해 주세요"); // 올해
		for (int i = 0; i < tour2.length; i++) {
			System.out.print((i + 1) + "순위 >> ");
			tour2[i] = sc.next();
		}

		System.out.println("=========");

		int num = 0;
		for (int i = 0; i < tour1.length; i++) {
			if (tour1[i].equals(tour2[i])) {
				num++;
			}
		}
		
		System.out.println("올해 가고싶은 곳과 작년에 가고싶었던 곳의 우선순위와 이름이 같은 곳은 " + num +"곳 입니다.");
		
		sc.close();
	}
}