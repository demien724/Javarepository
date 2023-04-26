package com.multi.mongoDB3;


import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_Insert2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 자바프로그램 <--연결설정(강물, 스트림)----- 콘솔
		System.out.print("id입력>>");
		String id = sc.next();
		System.out.print("pw입력>>");
		String pw = sc.next();
		System.out.print("name입력>>");
		String name = sc.next();
		System.out.print("tel입력>>");
		String tel = sc.next();
		sc.close();
		
		// 1) MongoDB 프로그램에 연결하자.
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. MongoDB 연결 성공!");

		// 2) shop2로 연결!
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공!");

		// 3) member.collection 에 연결!
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3. member Collection 연결 성공!");

		Document doc = new Document();
		doc.append("id", id);
		doc.append("pw", pw);
		doc.append("name", name);
		doc.append("tel", tel);

		collection.insertOne(doc);

		client.close();
	}
}