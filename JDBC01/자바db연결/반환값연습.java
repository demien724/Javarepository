package 자바db연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class 반환값연습 {
	// 기능 처리를 위한 Class
	
	public void add2() {
		System.out.println("더하기를 수행합니다.");
	}
	
	public int add(int x, int y) {
		return x+y;
	}

	public double add(double x, double y) {
		return x + y;
	}
	
	public String add(String x, String y) {
		return x+y;
	}
	
	// 멤버변수가 하나라도 String이면 그 결과값은 String으로 처리
	public String add(int x, String y) {
		return x+y;
	}
	
	// x앞의 타입인 int[]를 사용합니다.
	public int[] add() {
		int[] x = {1,2,3};
		return x;
	}
	
	// 변수 앞의 데이터 타입을 사용
	public Date getDate() {
		Date date = new Date();
		return date;
	}
	
	public Random getRandom() {
		Random r = new Random();
		return r;
	}
	
	public int getRandom2() {
		Random r = new Random();
		return r.nextInt();
	}
	
	public int getHour() {
		Date date = new Date(); //import java.util.Date;
		return date.getHours(); //시 11
	}
	
	public ArrayList getList() {
		ArrayList list = new ArrayList();
		list.add("감자");
		list.add("고구마");
		return list;
	}
	
	public HashSet getSet() {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("펜");
		return bag;
	}
	
//	public Connection getConnection(String url, String user, String password) {
//		//연결처리..
//		Connection con = 연결처리하는 커넥션..;
//		return con;
//	}
	
}
