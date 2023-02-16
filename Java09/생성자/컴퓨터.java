package 생성자;

public class 컴퓨터 {
	int price;
	String name;
	int size;
	
	public 컴퓨터(int price, String name, int size) {
		this.price = price;
		this.name = name;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", name=" + name + ", size=" + size + "]";
	}
	
	
	
}
