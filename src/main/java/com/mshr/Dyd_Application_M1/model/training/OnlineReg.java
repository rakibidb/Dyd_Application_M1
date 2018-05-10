package com.mshr.Dyd_Application_M1.model.training;

import javax.persistence.*;

@Entity
public class OnlineReg {

	@Id
	@GeneratedValue
	private Integer id;

	private String userName, name, password, phone;

	public OnlineReg() {

	}

	public OnlineReg(Integer id, String userName, String name, String password, String phone) {

		this.id = id;
		this.userName = userName;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
