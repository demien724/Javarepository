package 생성자;

public class TV사용하기 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.ch = 10;
		tv1.volume = 9;
		tv1.onOff = true;
		tv1.채널을바꾸다();
		System.out.println(tv1.ch + " " + tv1.volume + " " + tv1.onOff);
		
		TV tv2 = new TV();
		tv2.ch = 20;
		tv2.volume = 15;
		tv2.onOff = false;
		tv2.유튜브를보다();
		System.out.println(tv2.ch + " " + tv2.volume + " " + tv2.onOff);

	}

}
