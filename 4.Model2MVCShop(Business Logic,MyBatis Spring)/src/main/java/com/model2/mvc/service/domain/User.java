package com.model2.mvc.service.domain;

import java.sql.Date;


//==>ȸ�������� �𵨸�(�߻�ȭ/ĸ��ȭ)�� Bean
public class User {
	///Field
	private String userId;
	private String userName;
	private String password;
	private String role;
	private String ssn;
	private String cellPhone;
	private String addr;
	private String email;
	private Date regDate;
	
	///Constructor
	public User(){
	}
	
	///Method 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", role=" + role + ", ssn=" + ssn
				+ ", cellPhone=" + cellPhone + ", addr=" + addr + ", email=" + email
				+ ", regDate=" + regDate + "]";
	}
}