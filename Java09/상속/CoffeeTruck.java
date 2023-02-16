package 상속;

public class CoffeeTruck extends Truck{
		String[] coffee = {"에스프레소", "아메리카노"};
		
		@Override
		public void load() {
			System.out.println("짐을 싣습니다.");
			System.out.println("커피 재료도 싣습니다.");
		}
		
		public void makeCoffee() {
			System.out.println("커피를 만듭니다.");
			for (int i = 0; i < color.length; i++) {
				System.out.print(coffee[i] + " ");
			}
		}
		
		
		
}
