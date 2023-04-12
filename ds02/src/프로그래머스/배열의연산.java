package 프로그래머스;

import java.util.Arrays;

public class 배열의연산 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		double answer  = sol.solution(nums);
		System.out.println(answer);
	}
}

class Solution4 {
    public double solution(int[] numbers) {
    	double answer = 0;    	
    	Arrays.sort(numbers);
    	
    	for (int i = 1; i <= 3; i++) {
			answer += numbers[numbers.length-i];
		}
    	
    	return answer;
    }
}