package 상속기본;

public class FlyCar사용 {

	public static void main(String[] args) {
		FlyCar car1 = new FlyCar();
		
		
		car1.fly = true;
		car1.fly();
		car1.fly = false;
		car1.fly();
	}

}
