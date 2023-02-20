package 복습;

public class MaskUse {

	public static void main(String[] args) {
		Mask mask1 = new Mask("하얀색", 1000, 3);

//		멤버 변수값을 매번 준다.  >>> 객체 생성시 무조건 멤버변수를 넣어주는 처리를 하고싶다.
//		생성자 사용

//		mask1.color = "하얀색";
//		mask1.price = 1000;
//		mask1.count = 3;

//		System.out.println(mask1.color);
//		System.out.println(mask1.price);
//		System.out.println(mask1.count);

		System.out.println(mask1);
	}

}
