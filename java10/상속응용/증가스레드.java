package 상속응용;

// 동시에 실행시키고 싶은 Thread로 만들어주세요
// Thread클래스를 상속시키면 바로 만들어짐.
public class 증가스레드 extends Thread{
	
	// 동시에 실행할 내용을 run()메서드 안에 넣어주세요.
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("증가 >> " + i);
		}
	}
}
