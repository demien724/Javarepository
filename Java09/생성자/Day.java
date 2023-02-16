package 생성자;

public class Day {
	String doing;
	int time;
	String location;
	
	
	static int count;
	static int accumulatedTime;
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		
		count++;
		accumulatedTime += time;
	}
	
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
}
