package 문자열;

public class test {
	public static void main(String[] args) {
		String str = new String("Hello World");
		String str2 = new String("Hello Wolrd");

		System.out.println(str.charAt(0)); // String은 여러개의 char이 저장되어있는 기본형 변수들이 저장되어있는 주소를 지정하는 참조변수
											// charAt은 인덱스로 저장된 변수들을 특정한 하나의 변수를 인덱스로 지정해 추출하는 함수

		System.out.println(str.indexOf('H'));
		/*
		 * String의 앞에서부터 해당 글자를 찾아
		 * 해당 글자가 있으면 해당 글자의 인덱스를 반환
		 * 없으면 -1 반환 
		 */
		
		System.out.println(str.concat(str2));
		/*
		 * 해당 String 뒤에 String을 붙인 값을 반환
		 */
		
		
		String str3 = "This is Java";
		String str4 = "This is Java";	// 
		
		System.out.println(str2.equals(str));
		System.out.println(str2.toString() == str.toString());
		System.out.println(str3.equals(str4));
		
		
	}
	
	
}

abstract class tv {
	abstract void play(int pos);
	abstract void stop();
}
