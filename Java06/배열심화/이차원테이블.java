package 배열심화;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;

public class 이차원테이블 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);

		String[] header = { "a", "b", "c" };
		String contents[][] = { { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" } };
		
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		
		table.setFont(new Font("LG PC", Font.BOLD, 20));
		
		frame.add(scroll);
		frame.setVisible(true);
		

	}
}
