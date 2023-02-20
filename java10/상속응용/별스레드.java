package 상속응용;

public class 별스레드 extends Thread{
// 동시에 처리하고 싶은 내용을 run() 함수 내에 써주세요
	
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("★");
		}
	}
}
