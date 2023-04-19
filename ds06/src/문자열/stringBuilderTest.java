package 문자열;

public class stringBuilderTest {
	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello World";
		
		System.out.println(s1 == s2);	// 주소 비교
		System.out.println(s1.equals(s2));	// 주소가 가리키는 값을 비교
		
		/*
		 * String은 그 가리키는 값이 변할 때마다 새로운 메모리 공간를 차지하기 할당하기 때문에 
		 * 메모리 관리 측면에서 비효율적
		 */
	}
}
