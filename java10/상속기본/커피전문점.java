package 상속기본;

public class 커피전문점 {

	public static void main(String[] args) {
		매니저 manager = new 매니저();
		manager.name = "홍길동";
		manager.address = "강남구";
		manager.salary = 100;
		manager.bonus = 50;
		manager.test();
	}

}
