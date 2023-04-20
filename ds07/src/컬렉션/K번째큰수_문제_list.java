package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K번째큰수_문제_list {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(33);
		list.add(66);
		list.add(11);
		list.add(10);
		list.add(15);
		
		int k = 2;		// K번재 큰 숫자를 반환
		
		Collections.sort(list);
		
		System.out.println(k+"번째 큰 수는 : " + list.get(list.size()-k));
		
	}
}
