package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		// Scanner 
		Scanner sc = new Scanner(System.in);			
			
		// 자바 프로그램과 콘솔간에 통로를 만든다.
		// 연결통로 == 강물(스트림, stream)
		
		System.out.println("요일 입력 : 주중1) 주말2)");
		int data1 = sc.nextInt();
		
		if(data1 == 1) {
			System.out.println("공부");
		}else {
			System.out.println("휴식");
		}
		
		System.out.println("주말에 뭐할까");
		String data2 = sc.next();
		System.out.println("주말에 " + data2 + "함");
		
		// Stream은 내가 갖고 있지 않으면 계속 갖고있게 됨.
		// Stream은 반드시 닫아줄 것(중요)
				
		sc.close();
		
	}

}
