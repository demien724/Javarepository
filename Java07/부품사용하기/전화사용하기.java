package 부품사용하기;

import 부품만들기.전화기;

public class 전화사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		전화기 p1 = new 전화기();
		p1.price = 1000;
		p1.shape = "폴더";

		p1.인터넷하다();

		System.out.println("p1의 가격" + p1.price);
		System.out.println("p1의 가격" + p1.shape);

		전화기 p2 = new 전화기();
		p2.price = 2000;
		p2.shape = "네모";
		p2.카톡하다();
		
		System.out.println("p2의 가격" + p1.price);
		System.out.println("p2의 가격" + p1.shape);

	}

}
