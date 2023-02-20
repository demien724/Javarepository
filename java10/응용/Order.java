package 응용;

public class Order {

	public static void main(String[] args) {
		Thread_1 noOrder = new Thread_1();
		Thread_2 newOrder = new Thread_2();
		
		
		noOrder.start();
		newOrder.start();
	}

}
