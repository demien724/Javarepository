package 상속;

public class 원더우먼 extends 우먼{
	String item;
	
	public void run() {
		System.out.println("정말로 빠르게 달립니다.");
	}
	
	public void useItem() {
		System.out.println(item+"을(를) 사용합니다.");
	}
	
}
