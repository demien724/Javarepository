package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		String input01 = JOptionPane.showInputDialog("키를 입력하세요");
		String input02 = JOptionPane.showInputDialog("몸무게를 입력하세요");

		double height = Double.parseDouble(input01) / 100;
		double weight = Double.parseDouble(input02);

		double result = weight / (Math.pow(height, 2));
		
		System.out.println(result);
		
		
		JOptionPane.showMessageDialog(null, result);
	}

}
