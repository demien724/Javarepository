package 제어문;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String args[]) {
		// 프로그램은 어떤 순서로 짜야할까요
//		1. 입력 : 데이터를 갖고 옴
//		2. 처리 : 특정한 작업을 수행 
//		3. 출력 : 처리한 내용을 보여줌

//		자바는 자주 사용하는 부품은 대문자로 바로 쓸 수 있어요.
//		외부에서 대화창같은 것으로 입력받은 경우, 컴퓨터는 무조건 String(문자열)로 인식합니다.
		String name = JOptionPane.showInputDialog("당신의 이름은? ");

		String result = "나의 이름은 " + name + "입니다.";
		
		System.out.println(result);
	}
}
