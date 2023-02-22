package 인터페이스;

public class 컴퓨터사용 {
	public static void main(String[] args) {
		AppleComputer appleCom = new AppleComputer();
		BananaComputer bananaCom = new BananaComputer();
		
		appleCom.booting();
		appleCom.click();
		appleCom.typing();
		bananaCom.booting();
		bananaCom.click();
		bananaCom.typing();
	}
}
