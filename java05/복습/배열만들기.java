package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 배열 만들기 ( 이미 값을 알고 있는 경우 )
		String[] hobby = { "run", "book", "swim", "walk" };
		System.out.println(hobby);
		System.out.println("0 : " + hobby[0]);
		System.out.println("1 : " + hobby[1]);
		System.out.println(hobby.length); // hobby.length >> 4
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length - 1]);
		
		// C타입의 for문
		for (int i = 0; i < hobby.length; i++) {
			// i는 index의 역할, 0, 1, 2
			System.out.println( i + " : " + hobby[i]);
		}
		
		// For-each문 : 자동으로 인덱스를 처음부터 하나씩 증가하면서 꺼내온다.
		// 					출력용
		
		// 최근의 언어는 For-each문을 더 선호함
		// for ( 데이터타입 데이터 : 참조형변수의 이름 ) 의 구조
		for (String x : hobby) {
			System.out.println(x);
		}

		// 2. 배열 만들기 ( 공간부터 만드는 경우 )
		String[] jobs = new String[5]; // 공간만 만들어놓은 배열을 만들 경우, 그 크기는 뒤에 설정해 놓는다.
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페 주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[4]);
		System.out.println(jobs[jobs.length - 1]);

		
		for (String x : jobs) {
			System.out.println(x);
		}
	}

}
