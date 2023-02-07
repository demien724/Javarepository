package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
//		기본 순차문
//		입력 > 처리 > 출력

//		1. 입력 ㅡ 부품 사용
		String data1 = JOptionPane.showInputDialog("당신의 취미는?");
		String data2 = JOptionPane.showInputDialog("언제 하시나요?");

//		더해지는 데이터가 하나라도 String이면 결과는 무조건 String
//		2. 처리 ㅡ 글자 연결	
		String result1 = data1 + data2;

//		출력 ㅡ 모니터 화면에 보이고 싶음
		System.out.println(result1);
	}

}
