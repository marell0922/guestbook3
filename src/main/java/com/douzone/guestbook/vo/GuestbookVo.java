package com.douzone.guestbook.vo;

public class GuestbookVo {
	private long no;
	private String name;
	private String password;
	private String message;
	private String reg_date;
	public void setNo(long no) {
		this.no=no;
	}
	public long getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "GuestbookVo [name=" + name + ", passwd=" + password + ", message=" + message + ", reg_date=" + reg_date
				+ "]";
	}
	
}
