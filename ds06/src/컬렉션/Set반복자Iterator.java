package 컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자Iterator {

	public static void main(String[] args) {
		HashSet<String> bag = new HashSet<>();
		
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("볼펜");
		
		System.out.println(bag.size());		// 사이즈	
		System.out.println(bag);			// 무엇이 들어있는지
		
		
		// Set에서 꺼내올 때에는 iterator을 만들어주어야합니다.
		Iterator<String> it = bag.iterator();
		
		System.out.println(it.hasNext());	// 존재의 유무를 확인합니다
		
		for (int i = 0; i < bag.size(); i++) {
			String x = it.next();
			System.out.println(x);
		}
	}

}
