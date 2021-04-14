package com.poonam.dto;

import java.util.Date;

import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class CustomerDto {

	@Id
	private int id;
	private String name;
	private String address;
	private String mobNo;
	private int billTotal;
	private int amountPaid;
	private Date billDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public int getBillTotal() {
		return billTotal;
	}
	public void setBillTotal(int billTotal) {
		this.billTotal = billTotal;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
 	
}
