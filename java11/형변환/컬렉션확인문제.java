package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class 컬렉션확인문제 {

	public static void main(String[] args) {
			// 1. 
			HashSet tour = new HashSet();
			
			tour.add("도쿄");
			tour.add("서울");
			tour.add("LA");
			tour.add("뉴욕");
			tour.add("도쿄");
			tour.add("파리");
			
//			JoptionPane 활용
//			while(tour.size()<5) {
//				String place = JOptionPane.showInputDialog((tour.size()+1)+"번째 여행지를 적으세요");
//				if(place.isEmpty() == false) {
//					tour.add(place);
//				}			
//				else {
//					JOptionPane.showMessageDialog(null, "여행지를 입력하세요");
//				}
//			}
			
			System.out.println("<<<   1번 문제   >>>");
			System.out.println(tour);
			System.out.println();
			
			// 2. 
			HashMap furniture = new HashMap();
			
			furniture.put("안방", "TV");
			furniture.put("거실", "소파");
			furniture.put("부엌", "냉장고");
			furniture.put("현관", "신발");
			
			System.out.println("<<<   2번 문제   >>>");
			System.out.println(furniture);									// 2-1
			System.out.println(furniture.get("현관"));					// 2-2
			System.out.println(furniture.replace("거실", "책상"));	// 2-3
			System.out.println();
			
			// 3.
			LinkedList work = new LinkedList();
			
			work.add("공부");
			work.add("복습");
			work.add("취미");
			work.add("밥");
			work.add("잠");
			
			System.out.println("<<<   3번 문제   >>>");
			System.out.println(work);
			System.out.println(work.get(0) + " , " + work.get(work.size()-1));
			
			work.set(1, "청소");				
			System.out.println(work);
			
			// 3. Arraylist;
			ArrayList array = new ArrayList();
			array.add("공부");
			array.add("복습");
			array.add("취미");
			array.add("밥");
			array.add("잠");
			
			System.out.println(array);
			
	}

}
