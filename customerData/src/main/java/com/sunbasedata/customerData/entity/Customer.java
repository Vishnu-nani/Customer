package com.sunbasedata.customerData.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Customer implements Serializable{

	@Id
	@Column
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	int id;
	
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private String street;
	
	@Column
	private String address;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String email;
	
	@Column
	private String phone;
}
