package com.multi.chatbot;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
	
	@MessageMapping("/chat")	// 채팅내용을 받을때 사용하는 주소, RequestMapping과 같은 역할
	@SendTo("/topic/messages")	// 주소가입한 브라우저에 return message를 JSON으로 변환해서 보내줌
	public OutputMessage send(Message message) {
		System.out.println("Data >> " + message);
		OutputMessage out = new OutputMessage();
		out.setFrom(message.getFrom());
		out.setText(message.getText());
		Date date = new Date();
		out.setTime(date.getHours() + " : " + date.getMinutes());
		
		return out;
	}
	
	@MessageMapping("/chat")	
	@SendTo("/topic/messages2")
	public void send2(Message message) {	// from : guest, test : 1
		OutputMessage2 out = new OutputMessage2();
		String menu = "";
		switch (message.getText()) {
		case "1":
			menu = "";
			break;
		case "2":
			menu = "";
			break;
		case "3":
			menu = "";
			break;
		default:
			break;
		}
		
	}
}
