package 화면db연결;

public class MemberVO {
	// MeberVO 에 넣은 데이터는 MeberTable에 들어갑니다.
	// 각 컬럼과 일치시켜 줌.
	
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	
	// Setter, 변수에 값을 설정함
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// Getter, 변수에 있는 값을 가져옴
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
}
