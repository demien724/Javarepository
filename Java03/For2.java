package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for ( ; ; ) {	// 무한 루프
			System.out.println("잘 쓰이지 않음");
			String data = JOptionPane.showInputDialog("종료할까요? Y를 입력");
			
//			== 연산자는 기본데이터만 비교 가능
//			기본데이터 : 정수, 실수, 문자, 논리
			
			if(data.equals("y") || data.equals("Y")) {
				System.out.println("안녕히가세요");
				break;			// for문의 break
			} 
		}
	}

}
