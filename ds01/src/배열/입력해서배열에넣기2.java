package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//자바프로그램과 콘솔(키보드)를 스트림(강물) open
		double[] numbers = new double[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
			//입력받아서, int로 바꾼후, 배열에 넣어라!
		}
		sc.close();//stream close
		for (double x : numbers) {
			System.out.println(x);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 33.3 || numbers[i] == 22.2) {
				System.out.println(i);
			}
		}
	}

}