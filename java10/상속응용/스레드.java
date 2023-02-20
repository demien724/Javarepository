package 상속응용;

public class 스레드 {

	public static void main(String[] args) {
		// 스레드 부품 2개 사용
		증가스레드 up = new 증가스레드();
		감소스레드 down = new 감소스레드();
		
		// 스레드 프로그램 2개 시작
		up.run();
		down.run();
	}
}
