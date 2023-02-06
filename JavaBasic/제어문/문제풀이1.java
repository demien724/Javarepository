package 제어문;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
//		입력
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요");
		String afterClass = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
//		처리
		String text = "오늘 " + today + "에 수업 후 나는 "+ afterClass +"할 예정";
		
//		출력
		System.out.println(text);
	}

}
