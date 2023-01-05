package com.masai.model;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	@Size(min = 3, max = 15, message = "The first name should be min 3 and max of 15 characters.")
	private String firstName;
	
	@Size(min = 1, max = 15, message = "The last name should be min 1 and max of 15 characters.")
	private String lastName;
	
	@Size(min = 10, max = 10, message = "Mobile Number should contain 10 digit only")
	private String mobileNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_address",joinColumns = @JoinColumn(name="customer_id",referencedColumnName = "customerId"))
	private Address address;
	
	@Email(message = "Please enter valid email address")
	private String email;
	
	@NotNull(message ="username should not be null")
	@Size(min =3,max=15,message="length of username must be between 3 & 15")
	private String username;

	@NotNull(message ="user password should not be null")
	@Size(min =3,max=10,message="length of username must be between 3 & 10")
	private String password;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Customer(Integer customerId,
			@Size(min = 3, max = 15, message = "The first name should be min 3 and max of 15 characters.") String firstName,
			@Size(min = 1, max = 15, message = "The last name should be min 1 and max of 15 characters.") String lastName,
			@Size(min = 10, max = 10, message = "Mobile Number should contain 10 digit only") String mobileNumber,
			Address address, @Email(message = "Please enter valid email address") String email,
			@NotNull(message = "username should not be null") @Size(min = 3, max = 15, message = "length of username must be between 3 & 15") String username,
			@NotNull(message = "user password should not be null") @Size(min = 3, max = 10, message = "length of username must be between 3 & 10") String password) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", email=" + email + ", username="
				+ username + ", password=" + password + "]";
	}

	
	
	public Customer()
	{
		
	}

	
	

}
