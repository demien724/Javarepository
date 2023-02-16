package 스태틱;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순","여");
		딸 d2 = new 딸("유길순","여");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(딸.count);
		System.out.println(딸.wallet);

		d1.TV보다();
	}

}
