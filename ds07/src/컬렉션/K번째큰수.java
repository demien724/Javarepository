package 컬렉션;

import java.util.Arrays;

public class K번째큰수 {
	public static void main(String[] args) {
		int[] num = {3,1,5,6,4};
		int k = 2;
		
		Arrays.sort(num);
		System.out.println(num[num.length-k]);
		
	}
}
