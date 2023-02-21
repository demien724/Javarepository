package 주식정보시스템;


import java.util.Date;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버연스크롤링 {

	public static void main(String[] args) {
		// 코로나 일일 확진자 수 네이버 사이트
		Connection con = Jsoup.connect("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%BD%94%EB%A1%9C%EB%82%98");

		Document doc = null;		// Document, 참조형 변수 초기화 필수
		
		Date date = new Date();
		
		try {
			doc = con.get();		
			
			Elements arrayList01 = doc.select(".main_tab_area .info_01 .info_num");		// 코로나 일일 확진자 수 크롤링
			String nums = arrayList01.text(); // String으로 형변환
			
			System.out.println(date.toString() + " 일일 확진자 수 >> " + nums);
			
			
			
		} catch (Exception e) {
		}
	}
}