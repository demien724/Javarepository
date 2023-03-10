package 자바db연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class 반환값받아오기 {

	public static void main(String[] args) {
			반환값연습 re = new 반환값연습();
			
			re.add2();
			
			int result1 = re.add(100,200);
			System.out.println(result1);
			
			
//			String str = JOptionPane.showInputDialog("입력");							// String 타입, 타입 일치
//			String str = JOptionPane.showInternalMessageDialog(null, "출력값");	// Void 타입, 타입 불일치
			
			
			double result2 = re.add(22.1, 10);
			System.out.println(result2);
		
			String result3 = re.add("나는", "천재다");
			System.out.println(result3);
			
			String result4 = re.add(1, "번 천재");
			System.out.println(result4);
			
			int[] result5 = re.add();
			result5[0] = 5;
			
			System.out.println(result5[0]);
			System.out.println(result5[1]);
			System.out.println(result5[2]);
			
			
			Date result6 = new Date();
			System.out.println(result6.getMinutes());
			System.out.println(result6.getSeconds());
			System.out.println(result6.getDay());
			
			// return이 없는 값은 프린트가 불가능합니다.
			// return이 있는 값은 프린트가 가능합니다.
			
			int result7 = re.getHour();
			System.out.println(result7 + "시 입니다");
			
			int result8 = re.getRandom2();
			System.out.println("랜덤한 정수 >> " + result8 );
			
			ArrayList result9 = re.getList();
			System.out.println(result9.get(0));
			System.out.println(result9.get(1));
			
			result9.set(0, "양파");
			System.out.println(result9);
			
			
			HashSet result10 = re.getSet();
			System.out.println(result10);
			
			System.out.println(System.getenv());
	}
}
