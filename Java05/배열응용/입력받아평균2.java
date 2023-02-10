package 배열응용;

import java.util.Random;

public class 입력받아평균2 {
	public static void main(String[] args) {
		int[] n1 = new int[10000];

		int max = 0; // 수능만점자 인원수
		int min = 0; // 수능 0점 인원수
		int sum = 0; // 평균을 위한 합
		int count50 = 0;

		Random r = new Random(42);
		for (int i = 0; i < n1.length; i++) {
			n1[i] = r.nextInt(451);

//			1. 수능만점자들의 인원 수 체크
			if (n1[i] == 450) {
				max = max + 1;
			}

//			2. 수능 0점을 받은 인원 수 체크
			if (n1[i] == 0) {
				min = min + 1;
			}

//			3. 평균
			sum = sum + n1[i];
		}

//			4. 평균의 +- 50
		for (int i = 0; i < n1.length; i++) {
			int up = (sum / n1.length) + 50;
			int down = (sum / n1.length) - 50;

			if (n1[i] <= up && n1[i] >= down) {
				count50 = count50 + 1;
			}
		}
//			5. 상위 0.3퍼
		int[] n2 = n1;
		int temp= 0;
		
		for (int i = 0; i < n2.length; i++) {
			for (int j = i+1; j < n2.length; j++) {
				if(n2[i] < n2[j]) {
					temp = n2[i];
					n2[i] = n2[j];
					n2[j] = temp;
				}
			}
		}		// 점수가 높은 사람은 인덱스 0부터 넣는다.
		
		int manCount = 0;
		int scoreSum = 0;
		for (int i = 0; i < n2.length; i++) {
			manCount = manCount+1;
			scoreSum = scoreSum + n2[i];
			if(i > (n2.length*0.3)) {
				break;
			}
		}
		double avg = (double)scoreSum/manCount;
		
		System.out.println("상위 30%의 인원수는 >> "+ manCount);
		System.out.println("상위 30%의 평균은 >> "+ avg);
		
		System.out.println();
		
		System.out.println("수능 만점자의 인원 수는 >> " + max);
		System.out.println("수능 0점을 받은 인원 수는 >> " + min);
		System.out.println("수능점수 평균은 >> " + (sum / n1.length));
		System.out.println("평균보다 +- 50 점인 학생의 수는 >> " + count50);

	}

}
