package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

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
			Elements codeList2 = doc.select(".sptxt.sp_txt9");
			System.out.println(codeList2.size());
			Element tag2 = codeList2.get(0);
			String code2 = tag2.text();
			System.out.println("코드는 " + code2);

			//
			Elements codeList3 = doc.select(".sptxt.sp_txt10");
			System.out.println(codeList3.size());
			Element tag3 = codeList3.get(0);
			String code3 = tag3.text();
			System.out.println("코드는 " + code3);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}