package 형변환;

import java.util.LinkedList;

public class 시험 {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();

		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");

		int numTest = test.size();
		for (int i = 0; i < numTest - 1; i++) {
			System.out.println((i + 1) + "일차에 시험 본 후 남은 과목 : " + test);
			test.remove();
		}
	}

}
