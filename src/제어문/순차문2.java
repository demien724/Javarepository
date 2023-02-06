package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String args[]) {
		// 프로그램은 어떤 순서로 짜야할까요
//		1. 입력 : 데이터를 갖고 옴
//		2. 처리 : 특정한 작업을 수행 
//		3. 출력 : 처리한 내용을 보여줌

		String exercise = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		String text = day + "에 저는 " + exercise + "를 합니다.";
		
		System.out.println(text);
	}
}
