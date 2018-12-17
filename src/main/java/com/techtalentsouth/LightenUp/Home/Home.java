package com.techtalentsouth.LightenUp.Home;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Home {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String streetAddress;
	private String zipCode;
	private String city;
	private int rating;
	private String features;
	
	@Override
	public String toString() {
		return "Home [id=" + id + ", streetAddress=" + streetAddress + ", zipCode=" + zipCode + ", city=" + city
				+ ", rating=" + rating + ", features=" + features + "]";
	}

	public Home(String streetAddress, String zipCode, String city, int rating, String features) {
		this.streetAddress = streetAddress;
		this.zipCode = zipCode;
		this.city = city;
		this.rating = rating;
		this.features = features;
	}
	
	public Home() {
		
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public Long getId() {
		return id;
	}
}
