package 조건문;

public class if문2 {
	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
//		x가 y가 동일한지 비교
//		같으면 "동일합니다." 아니면 "동일하지 않습니다.
		
		if (x == y) {
			System.out.println("동일합니다.");
		}else {
			System.out.println("동일하지 않습니다.");
		}

		String id1 = "1111";
		String id2 = "2222";
//		id1 와 id2가 같은지 비교
//		동일하면 "로그인 성공"
//		동일하지 않으면 "로그인 실패"
		
		if (id1 == id2) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
}
