package com.multi.mongoDB3;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest_update {

	public static void main(String[] args) {
		// 1) MongoDB 프로그램에 연결하자.
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("1. MongoDB 연결 성공!");
		
		// 2) shop2로 연결!
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공!");
		
		// 3) member.collection 에 연결!
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3. member Collection 연결 성공!");	
		
		Document filter = new Document();
		filter.append("id", "friday");	// 조건
		
		// Update할 내용은 Bson(Json)을 만들어주세요
		Bson set = Updates.set("name", "winwinwin");
		
		collection.updateOne(filter, set);
		System.out.println("test");
	}
}