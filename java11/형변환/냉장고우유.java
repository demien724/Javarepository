package 형변환;

import java.util.LinkedList;

public class 냉장고우유 {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("어제 사온 우유");
		milk.add("오늘 사온 우유");
		milk.add("내일 사올 우유");
		
		milk.remove();
		System.out.println(milk);
		
		milk.remove();
		System.out.println(milk);
	}

}
