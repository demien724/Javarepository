package 응용;

public class Thread_1 extends Thread{
	int i;
		public void run() {
			
			while (true) {
				System.out.println(i + "시간이 흘러감");
				i++;
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					
				}
			}
		}
}
