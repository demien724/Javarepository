package 프로그래머스기본;

public class 양꼬치 {
	public static void main(String[] args) {
		
	}
}

class Solution02{
	public int solution(int n, int k) {
		int free = n / 10;
		
		
		int answer = n * 12000 + k * 2000 - free * 2000;
		return answer;
	}
}
