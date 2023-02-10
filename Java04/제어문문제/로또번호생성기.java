package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		
//		random r = new Random( Seed값 )
//		Seed값은 랜덤한 값이 아닌 프로그램 내에 저장된 랜덤한 값을 부르는 기능을 한다.
		Random r = new Random(10);
	
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : "+(r.nextInt(45)+1));	// 0~9
		}

		System.out.println();
//		2~10
		Random r1 = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("2~10 테스트 " + (r1.nextInt(9)+2));
		}
	
		System.out.println();
//		3~30
		Random r2 = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println("3~30 테스트 "+(r2.nextInt(28)+3));
		}
	
	}
	
	
	

	

}
