package 상속응용;

public class 동시실행프로그램2 {

	public static void main(String[] args) {
		특문스레드 special = new 특문스레드();
		특문스레드2 special2 = new 특문스레드2();
		특문스레드3 special3 = new 특문스레드3();
		
		special.start();
		special2.start();
		special3.start();
	}

}
