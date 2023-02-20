package 복습;

public class Mask {
	public String color;
	public int price;
	public int count;
	
	// 클래스 이름과 동일한 함수(메서드)를 만들면
	// new를 갖고 객체 생성 시 함수를 자동호출
	// 생성자(메서드) >> constructor(생성자)
	
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}

	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
}
