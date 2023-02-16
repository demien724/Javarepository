package 생성자;

public class 통장 {
	String name;
	String ssn;
	int money;

	
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	
	

}
