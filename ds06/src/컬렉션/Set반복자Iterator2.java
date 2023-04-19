package 컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자Iterator2 {

	public static void main(String[] args) {
		HashSet<Integer> money = new HashSet<>();
		
		money.add(1000);
		money.add(2000);
		money.add(3000);
		money.add(2000);
		money.add(4000);
		money.add(2000);
		money.add(3000);
		
		Iterator<Integer> it = money.iterator();
		System.out.println("용돈은 " + money.size());
		
		for (int i = 0; i < money.size(); i++) {
			System.out.println(it.next());
		}
		
	}

}
