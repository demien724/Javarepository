package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		int[] num = new int[3];
		
		try {
			num[3] = 2;			// 문제가 있는 코드
			
		} catch (Exception e) {
			System.out.println("배열에 문제가 있음");
			// e.printStackTrace();
		}
		
		System.out.println(num.length);
	}

}
