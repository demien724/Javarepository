package 화면db연결;

public class ExamPassVO {
	private String cert_Num = null;
	private String cert_Name = null;
	private String cert_Day = null;
	private int cert_Pass = 10;
	
	public String getCert_Num() {
		return cert_Num;
	}
	public void setCert_Num(String cert_Num) {
		this.cert_Num = cert_Num;
	}
	public String getCert_Name() {
		return cert_Name;
	}
	public void setCert_Name(String cert_Name) {
		this.cert_Name = cert_Name;
	}
	public String getCert_Day() {
		return cert_Day;
	}
	public void setCert_Day(String cert_Day) {
		this.cert_Day = cert_Day;
	}
	public int getCert_Pass() {
		return cert_Pass;
	}
	public void setCert_Pass(int cert_Pass) {
		this.cert_Pass = cert_Pass;
	}
	
	
	
	
}
