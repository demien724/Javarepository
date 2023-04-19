package 컬렉션;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자 {
	public static void main(String[] args) {
		String s ="abcabcadc";
		
		
		HashSet<String> set = new HashSet<>();
		String[] s2 = s.split("");
		
		System.out.println(Arrays.toString(s2));
		for(String x : s2) {
			set.add(x);	// 중복된 것은 들어가지 않음
		}
		
		System.out.println(set.size());
		System.out.println(set);
		
		
		Object[] set2 = set.toArray();
		List<String> list = Arrays.asList(s2);	// Collection
		
		String answer = "";
		for(Object x : set2) {
			if(Collections.frequency(list, x) == 1) {
				answer += x;
			}
		}
		System.out.println(answer);
	}
}
