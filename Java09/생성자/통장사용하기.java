package 생성자;

public class 통장사용하기 {

	public static void main(String[] args) {
		통장 여행통장 = new 통장("홍길동", "010101", 10000);
		통장 주택청약 = new 통장("홍길동", "010101", 20000);
		
		System.out.println(여행통장);
		System.out.println(주택청약);
	}

}
