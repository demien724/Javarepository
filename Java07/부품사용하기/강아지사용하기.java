package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 불독 = new 강아지();
		
		불독.색깔 = "검은색";
		불독.성별 = "남자";
		불독.산책 = 5;
		
		불독.산책하다();
		불독.짖다();
		
		강아지 리트리버 = new 강아지();
		리트리버.색깔 = "밝은 노란색";
		리트리버.성별 = "여자";
		리트리버.산책 = 10;
		
		리트리버.산책하다();
		리트리버.짖다();
	}
	

}
