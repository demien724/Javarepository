package 상속;

public class 영웅사람 {
	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;
		
		System.out.println(p);
		p.eat();
		
		맨 m = new 맨();
		m.run();
		
		슈퍼맨 s = new 슈퍼맨();
		s.name = "클라크";
		s.age = 25000;
		s.power = 500000;
		s.fly = true;
		s.eat();
		s.run();
		s.space();
		
		우먼 w = new 우먼();
		w.run();
		
		원더우먼 wonder = new 원더우먼();
		wonder.name = "다이애나";
		wonder.age = 15000;
		wonder.speed = 30000;
		wonder.item= "진실의 올가미";
		wonder.run();
		wonder.useItem();
	}
}
