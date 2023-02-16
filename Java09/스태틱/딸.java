package 스태틱;

public class 딸 {
	static int wallet = 10000;	// 아빠 지갑 상태
	static int count;				// 딸은 총 몇 명?
	
	String name;
	String gender;

	public 딸(String name, String gender) {
		this.name = name;
		this.gender = gender;
		
		wallet = wallet - 1000;
		count = count + 1;
	}
	
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}

	public void TV보다() {
		System.out.println(name + "이 TV를 봅니다.");
	}



	
}
