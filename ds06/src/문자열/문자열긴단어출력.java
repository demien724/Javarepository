package 문자열;

public class 문자열긴단어출력 {

	public static void main(String[] args) {
		String s = "i am a boy";
		
		String[] s2 = s.split(" ");
		
		String answer =  s2[0];	
		int max = s2[0].length();
		
		for(String str : s2) {
			if(str.length() > max) {
				max = str.length();
				answer = str;
			}
		}
		
		System.out.println(answer);
	}

}