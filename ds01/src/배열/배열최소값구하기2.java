package 배열;

public class 배열최소값구하기2 {
	public static void main(String[] args) {
		int[] numbers = { 90, 80, 20, 60, 70 };
		
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		
		System.out.println(min);
	}
}
