package com.paremal.educationservice.model;

public class StudentDto {
	private Integer id;

	private String name;
	
	private String address1;
	
	private String address2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", address1=" + address1 + ", address2=" + address2 + "]";
	}
	


}
