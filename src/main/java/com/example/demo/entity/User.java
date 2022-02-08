package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name = "User_details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;
	private String name;
	private Integer age;
	private String email;
	private String mobile_no;
	private String Address_line_1;
	private String Address_line_2;
	private String city;
	private String state;
	private String country;
	private Integer pin;
	private String Trainer_preference;
	private String Physiotherapist_requirement;
	private String Select_package;
	private String Weeks;
	private Integer Amount;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAddress_line_1() {
		return Address_line_1;
	}
	public void setAddress_line_1(String address_line_1) {
		Address_line_1 = address_line_1;
	}
	public String getAddress_line_2() {
		return Address_line_2;
	}
	public void setAddress_line_2(String address_line_2) {
		Address_line_2 = address_line_2;
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
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public String getTrainer_preference() {
		return Trainer_preference;
	}
	public void setTrainer_preference(String trainer_preference) {
		Trainer_preference = trainer_preference;
	}
	public String getPhysiotherapist_requirement() {
		return Physiotherapist_requirement;
	}
	public void setPhysiotherapist_requirement(String physiotherapist_requirement) {
		Physiotherapist_requirement = physiotherapist_requirement;
	}
	public String getSelect_package() {
		return Select_package;
	}
	public void setSelect_package(String select_package) {
		Select_package = select_package;
	}
	public String getWeeks() {
		return Weeks;
	}
	public void setWeeks(String weeks) {
		Weeks = weeks;
	}
	public Integer getAmount() {
		return Amount;
	}
	public void setAmount(Integer amount) {
		Amount = amount;
	}
	
	}


