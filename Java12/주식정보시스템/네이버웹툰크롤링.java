package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {
	
	/*
	 * 크롤링
	 * 인터넷 문서를 다 받아와서
	 * 
	 */

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		System.out.println(con);

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements list = doc.select(".genreRecom");
			System.out.println(list.size());
			
			Element tag = list.get(1);
			System.out.println(tag.text());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}