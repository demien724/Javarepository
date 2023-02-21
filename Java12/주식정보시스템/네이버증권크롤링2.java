package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	/*
	 * select("a") : tag <a> 
	 * select(".code") : <a class="code">
	 * select("#userId") : <a id="userId">
	 */

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements codeList = doc.select(".code");
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);

			//
			Elements codeList2 =  doc.select("span.blind");		// span 태그 밑에 있는 blind class를 가져옵니다.
			System.out.println(codeList2.size());
			System.out.println(codeList2);
			System.out.println();
			System.out.println(codeList2.get(12));
			Element tag2 = codeList2.get(12);
			String today = tag2.text();
			System.out.println("현재가는 >> " + today);
			
			Element tag3 = codeList2.get(16);
			String high = tag3.text();
			System.out.println("최고가는 >> " + high);
			
			Element tag4 = codeList2.get(20);
			String low = tag4.text();
			System.out.println("최저가는 >> " + low);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}