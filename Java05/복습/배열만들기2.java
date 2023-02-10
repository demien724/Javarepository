package 복습;

public class 배열만들기2 {

	public static void main(String[] args) {
		String[] tours = {"일본", "부산", "미국", "서울", "프랑스"};
		char[] colors = {'g', 's', 'b', 'o', 't'};
		double[] height = {160.5, 170.2, 173, 164.5, 160};
		
		System.out.println("여행지");
		for (String x : tours) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println("색상");
		for (char x : colors) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println("키");
		for (double x : height) {
			System.out.print(x + " ");
		}
		
		
	}

}
