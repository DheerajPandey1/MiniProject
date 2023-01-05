package com.masai.model;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	
	@Size(min = 3, max = 10, message = "Street no. should min of 3 and max of 10 Characters")
	private String streetNo;
	
	private String buildingName;
	
	@NotBlank(message = "City should not be blank.")
	private String city;
	
	@NotBlank(message = "State cannot be blank.")
	private String state;
	
	@NotBlank(message = "Country cannot be blank.")
	private String country;
	
	@NotBlank(message = "Pincode cannot be blank.")
	private String pincode;

	public Address(int addressId,
			@Size(min = 3, max = 10, message = "Street no. should min of 3 and max of 10 Characters") String streetNo,
			String buildingName, @NotBlank(message = "City should not be blank.") String city,
			@NotBlank(message = "State cannot be blank.") String state,
			@NotBlank(message = "Country cannot be blank.") String country,
			@NotBlank(message = "Pincode cannot be blank.") String pincode) {
		super();
		this.addressId = addressId;
		this.streetNo = streetNo;
		this.buildingName = buildingName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetNo=" + streetNo + ", buildingName=" + buildingName
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}

	public void setPincode() {
		
	}
}
