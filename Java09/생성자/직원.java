package 생성자;

public class 직원 {
	static int count;
	static int sumAge; // 모든 인원의 나이
	static double averageAge; // 모든 인원의 나이 평균

	String name;
	String gender;
	int age;

	// static메서드에서 전역변수에 접근할 때는
	// 같은 성격을 가진 static변수만 접근이 가능
	public static void getAvg() {
		System.out.println(sumAge / count);
	}

	public 직원(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;

		count = count + 1; // 인원수

		sumAge = sumAge + age;
		averageAge = (double) sumAge / count;

	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", sex=" + gender + ", age=" + age + "]";
	}

}
