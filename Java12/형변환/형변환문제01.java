package 형변환;

import java.util.ArrayList;

public class 형변환문제01 {

	public static void main(String[] args) {
			ArrayList me = new ArrayList();
			me.add(1000);		// Object << 업캐스팅 << Integer << 오토박싱 << Int
			me.add(189.1);	// Object << Double << double
			me.add(false);		// Object << Boolean << boolean	
			me.add('남');		// Object << Character << char
			
			// 1번
			System.out.println(me);

			// 2번
			System.out.println(1000+(int)me.get(0));		// int << 오토언박싱 << Integer << 다운캐스팅 << Object
			
			// 3번
			System.out.println(10+(Double)me.get(1));	// double << Double << Object
			
			// 4번
			if((boolean)me.get(2)) {
				System.out.println("배불러요");		// boolean << Boolean << Object
			} else {
				System.out.println("배고파요");
			}
			
			// 5번
			if((char)me.get(3) == '남') {				// char << Character << Object
				System.out.println("주민번호는 1,3");
			} else {
				System.out.println("주민번호는 2,4");
			}
			
			// 6번
			/* Object >> Integer >> Int */
			
	}
}	


