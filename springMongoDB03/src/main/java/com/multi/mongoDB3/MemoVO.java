package com.multi.mongoDB3;

public class MemoVO {
	private String name;
	private double age;
	private String office;
	private String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String toString() {
		return "MemoVO [name=" + name + ", age=" + age + ", office=" + office + ", phone=" + phone + "]";
	}
	
	
}
