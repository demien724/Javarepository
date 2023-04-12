package 문자열;

public class 스트링비교 {
	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		
		/*
		 * String은 그 식별자를 프린트 할 때, 그 주소가 가르키는 Char을 프린트되게
		 * 재정의 되어있는 객체(toString() override)
		 */
		System.out.println(s1);
		System.out.println(s2);
		
		/*
		 *  String이 가리키는 Char들이 동일한지 아닌지는
		 *  equals() 함수를 통해 확인 할 수 있다.
		 */
		
		System.out.println(s1.equals ( s2 ));
	
	}
}
