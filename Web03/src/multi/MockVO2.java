package multi;

public class MockVO2 {
	private String id;
	private String email;
	private String phone;
	private String last_name;
	private String first_name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String toString() {
		return "MockVO2 [id=" + id + ", email=" + email + ", phone=" + phone + ", last_name=" + last_name
				+ ", first_name=" + first_name + "]";
	}

}
