package 형변환;

import java.util.HashSet;
import java.util.Random;

import javax.swing.text.TableView.TableCell;

public class 로또문제3 {

	public static void main(String[] args) {
		Random r = new Random();

		HashSet lotto = new HashSet(); // 중복이 없는 Collection

		while (lotto.size() < 6) {
			lotto.add(r.nextInt(45) + 1); // 0 ~ 44 >> 1 ~ 45
		}

		System.out.println(lotto);
	}

}
