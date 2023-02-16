package 생성자;

public class Mask {
		String Color;
		int price;
		int count;
		
		
		public Mask(String color, int price, int count) {
			Color = color;
			this.price = price;
			this.count = count;
		}


		public String toString() {
			return "Mask [Color=" + Color + ", price=" + price + ", count=" + count + "]";
		}
		
		
}
