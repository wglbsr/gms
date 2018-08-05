package com.dyny.gms.db.pojo;

public class Users {
	private String username;
	private String password;
	private int userlevel;
	private String usercus;
	private int state;
	
	public Users () {}
	
	public Users(String username, String password, int userlevel, String usercus) {
		this.username = username;
		this.password = password;
		this.userlevel = userlevel;
		this.usercus = usercus;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserlevel() {
		return userlevel;
	}
	public void setUserlevel(int userlevel) {
		this.userlevel = userlevel;
	}
	public String getUsercus() {
		return usercus;
	}
	public void setUsercus(String usercus) {
		this.usercus = usercus;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
