package 응용;

import java.util.Random;

public class Thread_2 extends Thread{
	int i;
	public void run() {
		Random r = new Random();
		
		while (true) {
			System.out.println(i + "시 음식 " + (r.nextInt(10)+1) + "개 주문");
			i++;
			try {
				Thread.sleep(1000*(r.nextInt(5)+1));
			} catch (Exception e) {
				
			}
		}
	}
}
