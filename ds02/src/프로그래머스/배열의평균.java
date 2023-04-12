package 프로그래머스;

public class 배열의평균 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		double answer  = sol.solution(nums);
		System.out.println(answer);
	}
}

class Solution3 {
    public double solution(int[] numbers) {
    	double answer;
    	int result = 0;
    	
    	for (int i : numbers) {
			result += i;
		}
    	
    	answer = (double)result / numbers.length;
    	
        return answer;
    }
}