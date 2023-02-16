package 상속;

public class 내차들 {

	public static void main(String[] args) {
		CoffeeTruck myBusiness = new CoffeeTruck();
		
		myBusiness.name = "Food Truck";		// 차의 이름
		myBusiness.color = new String[2];		// 색상은 몇개가 들어가있는지
		myBusiness.color[0] = "밝은 커피색";	// 차 색 첫번째
		myBusiness.color[1] = "하얀색";			// 차 색 두번째
		myBusiness.weight = 1000;				//	무게 단위는 톤
		myBusiness.newProduct = true;			// 신품인가 중고인가
		
		myBusiness.coffee[0] = "프라푸치노";
		myBusiness.makeCoffee();
		
		
	}

}
