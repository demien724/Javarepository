package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형다형성 {

	public static void main(String[] args) {
		// 클래스 형변환 == 참조형 형변환
		// 상속!! 관계일때만 형변환이 가능합니다.

		ArrayList arr1 = new ArrayList();

		arr1.add("홍길동");
		arr1.add(100);
		arr1.add(11.22);
		arr1.add(new JButton("나는 버튼"));

		String name = (String) arr1.get(0);
		// String이 가지는 함수를 사용하려면 반드시 String으로 강제 형변환을 해야합니다.
		System.out.println(name.charAt(0));
		System.out.println(name.length());

		int age = (Integer)arr1.get(1);
		System.out.println(age + 1);
		
		double score = (Double)arr1.get(2);
		System.out.println(score);
		
		JButton b = (JButton)arr1.get(3);
		b.setText("나는 진짜 버튼");
		
		
		
	}

}
