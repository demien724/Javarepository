package com.multi.mongoDB3;

import java.util.ArrayList;
import java.util.List;

import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest2_실습 {

	public static void main(String[] args) {
		// 1) MongoDB 프로그램에 연결하자.
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. MongoDB 연결 성공!");

		// 2) shop2로 연결!
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공!");

		// 3) member.collection 에 연결!
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. member Collection 연결 성공!");

		// a번 문제

//		Document doc = new Document();
//		
//		doc.append("age", 500);
//		doc.append("name", "song");
//		doc.append("office", "busan");
//		doc.append("phone", "010");
//		
//		collection.insertOne(doc);
//		System.out.println("4. Test done");
//		

		// a_2 번 문제
//		List<Document> list = new ArrayList<Document>();
//
//		Document doc2 = new Document();
//		doc2.append("age", 501);
//		doc2.append("name", "song2");
//		doc2.append("office", "busan");
//		doc2.append("phone", "011");
//
//		Document doc3 = new Document();
//		doc3.append("age", 502);
//		doc3.append("name", "song3");
//		doc3.append("office", "seoul");
//		doc3.append("phone", "011");
//
//		Document doc4 = new Document();
//		doc4.append("age", 503);
//		doc4.append("name", "song4");
//		doc4.append("office", "busan");
//		doc4.append("phone", "011");
//
//		list.add(doc2);
//		list.add(doc3);
//		list.add(doc4);
//
//		collection.insertMany(list);
		
		
		// 3.
//		Document filter = new Document();
//		filter.append("age", 500);
//		
//		collection.deleteOne(filter);
		

//		Document filter2 = new Document();
//		filter2.append("age",501);
//		
//		Bson set = Updates.set("name", "winwinwin");
//		
//		collection.updateOne(filter2, set);
		
	
		FindIterable<Document> list = collection.find(); // 전체검색
		ArrayList<MemoVO> result = new ArrayList<MemoVO>();
		for(Document doc : list) {
			// System.out.println(doc);
			
			MemoVO bag = new MemoVO();
			bag.setName(doc.getString("name"));
			bag.setAge(doc.getInteger("age",0));
			bag.setOffice(doc.getString("office"));
			bag.setPhone(doc.getString("tel"));
			
			result.add(bag);
		}
		
		for(MemoVO bag : result) {
			System.out.println(bag);
		}
	}
}