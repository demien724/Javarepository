package multi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome2")
public class Hi extends HttpServlet {
	
	// Request는 웹 브라우저가 준 데이터를 활용할 때 사용한다..
	// Response는 웹 브라우저의 요청에 대해 반응할때 사용한다.
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service()메서드가 호출됨..여기있는 내용이 실행될 예정임.");
		String id = req.getParameter("id");
		System.out.println("서버에서 받은 데이터는 " + id);
		String pw = req.getParameter("pw");
		System.out.println("서버에서 받은 데이터는 " + pw);
	}
}
