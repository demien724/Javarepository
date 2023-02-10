package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
//		논리적으로 판단을 해야하는데, 조건이 2개 이상이여서
//		어떻게 판단해야할지 모르는 경우
		
		
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
//		 두 가지 변수가 같은지 비교하기위해서
//		== 를 사용한다.
		System.out.println("아이디가 같나요? "+ (id == id2));
		System.out.println("비밀번호가 같나요?  "+ (pw == pw2));
		
//		두 조건이 모두 맞은지를 확인하기 위해서는 && (and조건) 을 사용합니다.
		System.out.println("아이디, 비밀번호가 일치하나요? "+ ((id == id2) && (pw == pw2)));

		int member1 = 111;
		int member2 = 222;
		
//		|| (or조건)은 두 조건 중 어느 하나의 조건이라도 true일 경우 true를 반환한다.
		System.out.println(member1 == 111 || member2 == 222);
	}

}
