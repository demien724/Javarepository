package 배열;

public class 배열다루기 {
	public static void main(String[] args) {
		int[] x = new int[10]; // 12개의 공간이 생성 x , 10 , length
		
		x[0] = 10;
		x[1] = 20;
		
		for(int i =0;i<x.length;i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		// 우리 가족의 성별을 char[]로 저장, 프린트
		// 우리 가족의 이름을 String[]로 저장, 프린트
		// 우리 가족의 시력을 double[]로 저장, 프린트
		// 점심을 먹었는지 boolean[[으로 저장, 프린트
		
		char[] sex = {'f', 'm', 'm'};
		for (int i = 0; i < sex.length; i++) {
			System.out.print(sex[i] + " ");
		}
		System.out.println();
		
		String[] name = {"제임스", "모니카","샘"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		Double[] eye = { 0.2, 0.1 , -0.1};
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println();
		
		Boolean[] lunch = { true, true, false };
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
		
		
	}
}
