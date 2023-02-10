package 배열;

public class 배열다루기2 {
	public static void main(String[] args) {
//		1.
		int[] nums = new int[5];

//		2.
		System.out.println(nums[4]);

//		3.
		nums[0] = 100;

//		4.
		nums[4] = 500;
		
//		5.
		nums[2] = 200;
		
//		6.
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
//		7.
		for (int i = 0; i < nums.length; i++) {
			System.out.print( "인덱스 " + i +" : " + nums[i]);
		}
	}
	
	
}
