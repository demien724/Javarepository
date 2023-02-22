package 네트워크프로그램;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClints {

	public static void main(String[] args) throws Exception {
		/*
		 * 서버랑 클라이언트
		 * 양쪽에 전화기 역할을 하는 소켓이 있어야함
		 * 클라이언트에서 소켓을 만들어주면, 서버소켓으로
		 * 승인요청을 보내야함
		 */
		
		for (int i = 0; i < 10; i++) {
			Socket socket = new Socket("localhost", 9110);
			System.out.println("클라이언트 승인 요청 보냄");
		}
		
		
	}

}
