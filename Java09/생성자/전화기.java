package 생성자;

// main은 없어야 해요
public class 전화기 {
		// 성질 : 멤버변수
		public int price;				// 멤버 변수는 자동 초기화
		public String shape;			// 기본형이 아닌 경우 null로 초기화
		
		// 동작 : 멤버 메서드(함수와 동일), 동적인 기능을 수행
		//			인터넷을 보다, 메시지를 보내다.
		
		public 전화기() {
			System.out.println("전화기 객체가 만들어졌음");
		}

		public void 인터넷하다() {
			// 기능 처리하는 방법을 나열
			System.out.println("와이파이 연결하다.");
			System.out.println("데이터를 써서 연결하다.");
		}
		
		public void 카톡하다() {
			System.out.println("자바 단체톡을 하다.");
			System.out.println("게시물을 올리다.");
		}
}
