package 프로그래머스;

import java.util.Arrays;

public class 배열의연산2 {
	// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 27
	// {1, 2, 3, 4, 5, 9, 10} 24
	// 세수를 더했을 때 가장 큰 숫자를 구해보세요.
	// 배열이 오름차순으로 정렬이 되어 있는 상태!

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		//int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numbers = {-100, -2, 3, 4, 5, 9, 10};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
		
		double n1 = 3.0;
		int n2 = 3;
		
	}
}

class Solution5 {
	public int solution(int[] numbers) {
		int answer = 0;
		int answer2 = 0;

		Arrays.sort(numbers);

		answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
		answer2 = numbers[0] * numbers[1];

		if (answer > answer2) {
			return answer;
		} else {
			return answer2;
		}

	}
}