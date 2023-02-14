package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		// 입력 : 많은 양의 저장공간
		// 랜덤으로 데이터 입력
		// 반복문으로 배열위치 옮기면서 데이터 넣자.

		int[] problems = new int[990];
		int[] answers = new int[990];
//		System.out.println(problems.length);
//		System.out.println(answers.length);
//		System.out.println(problems);
//		System.out.println(answers);

		Random r = new Random(42);
		for (int i = 0; i < answers.length; i++) {
			problems[i] = r.nextInt(4) + 1;
			answers[i] = r.nextInt(4) + 1;
//			random.next(3) >> 0~2의 숫자가 출력 
		}

		System.out.println("번호\t:\t답안\t\t내답");
		for (int i = 0; i < answers.length; i++) {
			System.out.println(i + "\t:\t" + problems[i] + "\t<->\t" + answers[i]);
		}
		
		int score = 0;
		for (int i = 0; i < answers.length; i++) {
			if(problems[i] == answers[i]) {
				score ++;
			}
		}
		System.out.println("내 토익 점수는 : " + score);
		// 처리
		// 출력

	}

}
