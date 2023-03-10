package 자바db연결;

import 화면db연결.ProductVO;

public class ProductDAO {
	public void insert(ProductVO bag) {
		
		
		System.out.println("ID " + bag.getId());
		System.out.println("Name " + bag.getName());
		System.out.println("Content " + bag.getContent());
	} // insert Product
}
	