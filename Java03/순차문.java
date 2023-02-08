package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
//		입력 >> 처리 >> 출력
//		두 개의 숫자를 입력받아서 처리해서 출력
//		모든 프로그래밍은 손으로 치는 입력에 대해 String(문자열)로 취급합니다. 	
//		변수를 선언할때 Ram에 변수를 만들어진다.

		String num1 = JOptionPane.showInputDialog("첫 번째 숫자를 입력");
		String num2 = JOptionPane.showInputDialog("두 번째 숫자를 입력");

//		처리
//		String은 연산으로 사용이 불가능
//		String타입을 INT타입으로 변경
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);

//		출력
//		자바언어의 경우 정수와 정수의 연산은 그 결과가 무조건 정수로 나온다.
//		연산에 사용되는 변수 중 하나라도 실수이면 그 결과는 무조건 실수
		System.out.println((double)num11 / num22);
	}

}
