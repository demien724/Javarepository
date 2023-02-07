package 조건문;

import javax.swing.JOptionPane;

public class if문8 {
	public static void main(String[] args) {
//		1. 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
		String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
		String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요");
		String how = JOptionPane.showInputDialog("어떤 계산을 할것인가요? \n(+, -, *, / 중 택 1)");

		double num11 = Double.parseDouble(num1);
		double num22 = Double.parseDouble(num2);

		if (how.equals("+")) {
			System.out.println(num11 + " + " + num22 + " = " + (num11 + num22));
		} 
		else if (how.equals("-")) {
			System.out.println(num11 + " - " + num22 + " = " + (num11 - num22));
		} 
		else if (how.equals("*")) {
			System.out.println(num11 + " * " + num22 + " = " + (num11 * num22));
		} 
		else if (how.equals("/")) {
			System.out.println(num11 + " / " + num22 + " = " + (num11 / num22));
		} 
		else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}

//		2. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		String num3 = JOptionPane.showInputDialog("첫번째 소수점 숫자를 입력하세요");
		String num4 = JOptionPane.showInputDialog("두번째 소수점 숫자를 입력하세요");

		double num33 = Double.parseDouble(num3);
		double num44 = Double.parseDouble(num4);
		

		System.out.println(num33);
		
	
	}
}
