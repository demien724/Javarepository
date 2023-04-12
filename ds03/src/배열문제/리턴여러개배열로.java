package 배열문제;

import java.util.*;

public class 리턴여러개배열로 {

	public static void main(String[] args) {
		int money = 15000;
		
		Solution0 sol = new Solution0();
		int answer[] = sol.solution(money);
		System.out.println(Arrays.toString(answer));
		
		String str = "I'm";
		
		System.out.println(str.length());
	}
}

class Solution0 {
	public int[] solution(int money) {
		int[] answer = {0,0}; //몇잔, 나머지돈

		int price = 5500;
		answer[0] = money / price;
		answer[1] = money % price;
		
		return answer;
	}
}