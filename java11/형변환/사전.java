package 형변환;

import java.util.HashMap;

public class 사전 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("사과", "apple");
		map.put("멜론", "melon");
		map.put("바나나", "banana");
		
		System.out.println(map);
		System.out.println(map.get("사과"));
		
		map.remove("바나나");
		System.out.println(map);
		
		map.replace("사과", "Apple");
		System.out.println(map);
		
	}

}
