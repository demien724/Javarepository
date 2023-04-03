package com.multi.mvc200;

public class ComputerVO {
	private String com;
	private int comPrice;
	private String mouse;
	private int mousePrice;
	private int sum;
	
	
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public int getComPrice() {
		return comPrice;
	}
	public void setComPrice(int comPrice) {
		this.comPrice = comPrice;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public int getMousePrice() {
		return mousePrice;
	}
	public void setMousePrice(int mousePrice) {
		this.mousePrice = mousePrice;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "ComputerVO [com=" + com + ", comPrice=" + comPrice + ", mouse=" + mouse + ", mousePrice=" + mousePrice
				+ ", sum=" + sum + "]";
	}
	
	
	
	
	
}
