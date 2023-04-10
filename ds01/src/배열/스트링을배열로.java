package 배열;

public class 스트링을배열로 {
	public static void main(String[] args) {
		String s = "나는  프로그래머야";
		String s2 = "진짜";
		
		String s3 = "I'm hero";
		
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		System.out.println(s.endsWith("야"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,8));
		System.out.println(s.contains("프"));
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
	}
}
