package 문자열;

import java.util.Arrays;

public class 테스트 {
	public static void main(String[] args) {
		timeCheck.setStartTime();
		
		System.out.println("안녕하세요");
		
		timeCheck.setStartTime();
	}
}

class Solution{
	public String solution(String s) {
		String answer = "";
		
		return answer;
	}
}

class timeCheck{
	private static long startTime = 0;
	private static long endTime = 0;
	
	static void setStartTime() {
		startTime = System.currentTimeMillis();
	}
	static void setEndTime() {
		endTime = System.currentTimeMillis();
		System.out.println("Time diff : " + (endTime - startTime));
	}
}