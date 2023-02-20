package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제2 {

	public static void main(String[] args) {
		Random r = new Random(42);
		
		HashSet lotto = new HashSet();			// 중복이 없는 Collection
		
		System.out.println(lotto.size());
		for (int i = 0; i < 1000; i++) {
			lotto.add(r.nextInt(1000));
		}
		
		System.out.println(lotto.size());			// 중복이 되어서 10개가 아닌 6개의 숫자가 나와버림
		System.out.println(lotto);
	}

}
