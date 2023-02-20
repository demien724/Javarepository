package 상속기본;

public class FlyCar extends Car{
	boolean fly;
	
	public void fly() {
		
		if(this.fly == true) {
			System.out.println("자동차가 날아다닙니다");
		}
		else {
			System.out.println("자동차가 날지 않습니다");
		}
		
	}
}
