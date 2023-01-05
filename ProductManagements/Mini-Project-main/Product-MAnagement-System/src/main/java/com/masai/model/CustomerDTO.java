package com.masai.model;




public class CustomerDTO {

	private Integer userId;
    private String password;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CustomerDTO(Integer userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "CustomerDTO [userId=" + userId + ", password=" + password + "]";
	}
    
	public CustomerDTO() {
		
	}
}
