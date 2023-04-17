package 문자열;

public class 문자열포함인덱스 {

	public static void main(String[] args) {
		
		String s = ("aaabbccdda");
		System.out.println(s.contains("a"));
		System.out.println(s.contains("aaa"));
		System.out.println(s.contains("bc"));
		
		System.out.println(s.indexOf("a"));	// 해당 Char과 같은 첫번째의 위치
		System.out.println(s.lastIndexOf("a"));		// 문자열의 마지막 Index에서부터ㄴ 찾고자하는 문자를 탐색, 그 위치의 Index를 return
		System.out.println(s.lastIndexOf("a", 3));	// 
		System.out.println(s.lastIndexOf("a", 8));
		
		
	}

}
