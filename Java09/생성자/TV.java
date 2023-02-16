package 생성자;

public class TV {
	
	public static void main(String[] args) {
		TV tv1 =new TV(10, 9, true);
	}
	// 멤버 변수 선언 >> 클래스 바로 아래에 있기 때문에
	// 클래스 전체 영역에서 이 변수를 사용할 수 있다.

	// 전역 변수
	// 멤버 변수는 자동초기화 O, 전역 변수 역시 자동 초기화
	public int ch;
	public int volume;
	public boolean onOff;

	// 다른 생성자 메서드가 없으면 부품 만들때 자동으로 생성됨.
	// 기본 생성자 , 자동으로 만들어지는 함수

	public TV() {
		System.out.println("TV객체가 하나 생성됨");
	}

	public TV(int ch, int volume, boolean onOff) {
		this.ch = ch;
		this.volume = volume;
		this.onOff = onOff;
	}

	public void 채널을바꾸다() {
		int change = 1; // 지역변수, 로컬 변수, 자동 초기화 X
		System.out.println(ch + "에서" + change + "로 바꾸다");
	}

	public void 유튜브를보다() { // 메서드를 만드는 것 >> '메서드를 정의한다' 라고 합니다.
		System.out.println(volume + "을 키워서 동영상을 보다");
	}

}
