package 조건문;

public class if문5 {
	public static void main(String[] args) {
		String str = "990101";
	
		// String은 기본형 데이터가 아니여서 명령어(함수)를 사용해야함
		// String변수.equals() 명령어를 사용
		if(str.equals("990101")) {
			System.out.println("동일한 숫자");
		}else {
			System.out.println("동일하지 않은 숫자");
		}
		
//		charAt( n ) 함수는 n번째 char을 갖고옵니다.
		char gender = str.charAt(0);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("불명");
			break;
		}
	}
}
