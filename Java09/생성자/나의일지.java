package 생성자;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "삼성역");
		System.out.println(Day.count);
		System.out.println(Day.accumulatedTime);
		
		Day day2 = new Day("주변산책", 1, "코엑스 근방");
		System.out.println(Day.count);
		System.out.println(Day.accumulatedTime);
	
		/*
		 * 
		 * 
		 */
		
		Day day3 = new Day("시험요약정리", 2, "강의장");
		System.out.println(Day.count);
		System.out.println(Day.accumulatedTime);
		
	}

}
