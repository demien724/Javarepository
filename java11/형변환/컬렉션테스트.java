package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 다루는 부품류를 컬렉션(collection)
		// 종류가 많다
		// 많은 양의 특징이 있고, 그 특징에 따라
		// 컬렉션의 종류가 많음
		// 배열 + 사이즈 조절 + 아무 타입이나 넣을 수 있는 ArrayList

		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);

		// toString() 이 재정의 되어있어서 가리키는 값들이 프린트
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		list.add(0, "김길동");
		System.out.println(list);

		// 파괴함수 : 원본을 파괴시켜버리는 함수 ( 원형이 변경, RAM에 있는 데이터 변경 )
		// 비파괴함수 : 원본은 파괴하지 않는 함수 ( RAM에 있는 데이터 불변 )
		list.remove(0);					// 파괴 함수
		System.out.println(list);

		list.set(0, "정길동");			// 비파괴 함수
		System.out.println(list);

		// index 위치확인
		int index = list.indexOf(true);
		System.out.println(index);

		// 포함여주 확인
		boolean result = list.contains(11.2);
		System.out.println(result);

	}

}
