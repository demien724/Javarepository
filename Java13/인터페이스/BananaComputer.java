package 인터페이스;

public class BananaComputer implements Computer{

	@Override
	public void booting() {
		System.out.println("바나나컴퓨터 부팅 중 : 3초");
	}

	@Override
	public void click() {
		System.out.println("바나나컴퓨터 클릭 중 ");
	}

	@Override
	public void typing() {
		System.out.println("바나나컴퓨터 타이핑 중");
	}

}
