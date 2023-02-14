package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] 학기1성적 = { 44, 66, 22, 99, 100 };
		int[] 학기2성적 = 학기1성적.clone();

		int count01 = 0;
		int count02 = 0;

		String[] upper = new String[과목명.length];
		int count03 = 0;

		System.out.println(학기1성적 == 학기2성적); // 주소비교

		학기2성적[0] = 22;
		학기2성적[2] = 88;

		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기1성적[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + " ");
		}
		System.out.println();

		// 2번 문제
		for (int i = 0; i < 학기1성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				count01++;
			}
		}
		System.out.println("1, 2학기 중 성적이 동일한 과목은 " + count01 + "개");

		// 3번 문제
		for (int i = 0; i < 학기1성적.length; i++) {
			if (학기1성적[i] < 학기2성적[i]) {
				count02++;
			}
		}
		System.out.println("1학기에 비해 2학기에 성적이 오른 과목의 수는 >> " + count02);

		// 4번 문제
		for (int i = 0; i < 학기1성적.length; i++) {
			if (학기1성적[i] < 학기2성적[i]) {
				upper[count03] = 과목명[i];
				count03++;
			}
		}

		System.out.print("1학기에 비해 2학기에 성적이 오른 과목의 이름은 >> ");
		for (int i = 0; i < count03; i++) {
			System.out.print(upper[i] + " ");
		}
	}

}
