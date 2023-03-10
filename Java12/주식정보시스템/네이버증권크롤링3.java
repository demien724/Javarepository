package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {

	/*
	 * select("a") : tag <a> 
	 * select(".code") : <a class="code">
	 * select("#userId") : <a id="userId">
	 */

	public void naver(String codeTo) {
		
		if(codeTo.isEmpty()) {
			System.out.println("이상");
		}
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + codeTo);

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			// 코드 추출
			doc = con.get();
			Elements codeList = doc.select(".code");
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
			
			
			//<span class="blind">
			Elements list = doc.select("span.blind");
			//System.out.println(list.get(12));
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가 " + today);
			
			
			//System.out.println(list.get(20));
			Element tag3 = list.get(20);
			String low = tag3.text();
			System.out.println("최저가 " + low);
			
			//System.out.println(list.get(16));
			Element tag4 = list.get(16);
			String high = tag4.text();
			System.out.println("최고가 " + high);
			
			FileWriter name = new FileWriter("crolling.txt");
			name.write(code + "\n");
			name.write(today + "\n");
			name.write(low + "\n");
			name.write(high+ "\n");
			name.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}