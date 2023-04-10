package 배열;

public class 배열확인 {

	public static void main(String[] args) {
		
		
		double[] weight = new double[5];
		weight[0] = 45.5;
		weight[1] = 50.3;
		weight[2] = 43.6;
		weight[3] = 59.5;
		weight[4] = 55.3;
		
		for (int i = 0; i < weight.length; i++) {
			System.out.println(weight[i]);
		}
		for (double d : weight) {
			System.out.println(d);
		}
		
	}

}
