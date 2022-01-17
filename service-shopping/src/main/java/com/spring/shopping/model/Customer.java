package com.spring.shopping.model;

public class Customer {
    private Long id;


    private String numberID;

    private String firstName;


    private String lastName;


    private String email;


    private String photoUrl;

    private Region region;

    private String state;

    public Customer() {};
    
	public Customer(Long id, String numberID, String firstName, String lastName, String email, String photoUrl,
			Region region, String state) {
		super();
		this.id = id;
		this.numberID = numberID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.photoUrl = photoUrl;
		this.region = region;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumberID() {
		return numberID;
	}

	public void setNumberID(String numberID) {
		this.numberID = numberID;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
    
    
}