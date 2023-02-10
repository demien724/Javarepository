package 배열;

public class 배열1 {
	public static void main(String[] args) {
//	1번 문제
		int[] week = { 1, 2, 3, 4, 5, 6, 7 };

//	2번 문제
		System.out.println(week[0]);
		System.out.println(week[1]);

//	3번 문제
		System.out.println(week.length);

//	4번 문제
		week[2] = 10;
		week[4] = 12;

//	5번 문제
		System.out.println(week[2]);
		System.out.println(week[4]);

//	6번 문제
		int[] tour = new int[4];

//	7번 문제
		tour[0] = 20;
		tour[2] = 30;
//	8번 문제
		System.out.println(tour.length);
		
	}
}
