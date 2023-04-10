package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최대값구하기3 {
	public static void main(String[] args) {
		Random r = new Random(100);
		int[] numbers = new int[10];
		int[] numbers2 = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000);
			numbers2[i] = r.nextInt(1000);
		}
		
		// 오름차순으로 정렬
		Arrays.sort(numbers);	// 파괴형 함수
		
		System.out.println("최대값은 " + numbers[9]);
		System.out.println("최소값은 " + numbers[0]);
		
		if(Arrays.equals(numbers,numbers2)) {
			System.out.println("2개의 배열이 같다.");
		}else {
			System.out.println("2개의 배열이 다르다.");
		}
		
		String result = Arrays.toString(numbers);
		System.out.println(result);
		
		System.out.println("스트링의 글자 수 :" + result.length());
		System.out.println("배열의 개수 : " + numbers.length);
	}
}
