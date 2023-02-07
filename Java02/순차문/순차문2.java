package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
//		기본 순차문
//		입력 > 처리 > 출력

//		1. 입력 ㅡ 부품 사용
		String data1 = JOptionPane.showInputDialog("정수를 입력하세요-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하세요-2");

//		2. 처리 ㅡ 글자 연결	
//		더해지는 데이터가 하나라도 String이면 결과는 무조건 String
		int data11 = Integer.parseInt(data1);
		int data22 = Integer.parseInt(data2);

		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);

		int result1 = data11 + data22;
		double result2 = data33 + data44;

//		3. 출력 ㅡ 모니터 화면에 보이고 싶음
		System.out.println(result1);
		System.out.println(result2);
	}

}
