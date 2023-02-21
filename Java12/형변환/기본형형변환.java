package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {	
			byte b1 = 100;		// 1Byte , -128~127
			int i1 = 200; 		// 4Byte , -21억~21억
			
			i1 = b1;			// 문법적으로 문제는 없음
			
			b1 = (byte)i1;		// 작 << 큰 = 강제형변환
			
			double d1 = i1;	// 자동형변환
			i1 = (int)d1;
			
	}

}
