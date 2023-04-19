package 문자열;

import java.util.Arrays;

public class A를B로만들기 {
	public static void main(String[] args) {
		String answer  = "Badc";
		
		char[] charSet =  answer.toLowerCase().toCharArray();
		
		Arrays.sort(charSet);
		answer = charSet.toString();
		System.out.println(new String(charSet));
		
		System.out.println(Arrays.toString(charSet));
	}
}
