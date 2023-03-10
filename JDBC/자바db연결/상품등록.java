package 자바db연결;

import java.util.Scanner;

import 화면db연결.ProductVO;

public class 상품등록 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID/Name/Content 순으로 입력하세요.");
		
		String id = sc.next();
		String name = sc.next();
		String content = sc.next();
		
		ProductVO bag = new ProductVO();		// 가방을 생성
		bag.setId(id);
		bag.setName(name);
		bag.setContent(content);
		
		ProductDAO table = new ProductDAO();		// 가방의 내용을 ProductDAO의 인스턴스인 table에 넣음
		table.insert(bag);
	}

}
