package com.brinker.example;

public class BrinkerPatron {
	
	private String bmemberid;
	private String phoneNumber;
	private String email;
	private int transactionPoints;
	private boolean platinumStatus;
	private String lastVisit;
	private String pointsExpire;
	private String plentiCardNumber;
	
	public BrinkerPatron(String bmemberid, String phoneNumber, String email, 
			              int transactionPoints, boolean platinum, String lastVisit,
			              String pointsExpire, String plentiNumber) {
		
		this.bmemberid = bmemberid;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.transactionPoints = transactionPoints;
		this.platinumStatus = platinum;
		this.lastVisit = lastVisit;
		this.pointsExpire = pointsExpire;
		this.plentiCardNumber = plentiNumber; 
	}
	
	public String getBmemberid() {
		return bmemberid;
	}

	public void setBmemberid(String bmemberid) {
		this.bmemberid = bmemberid;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTransactionPoints() {
		return transactionPoints;
	}

	public void setTransactionPoints(int transactionPoints) {
		this.transactionPoints = transactionPoints;
	}

	public boolean isPlatinumStatus() {
		return platinumStatus;
	}

	public void setPlatinumStatus(boolean platinumStatus) {
		this.platinumStatus = platinumStatus;
	}

	public String getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(String lastVisit) {
		this.lastVisit = lastVisit;
	}

	public String getPointsExpire() {
		return pointsExpire;
	}

	public void setPointsExpire(String pointsExpire) {
		this.pointsExpire = pointsExpire;
	}

	public String getPlentiCardNumber() {
		return plentiCardNumber;
	}

	public void setPlentiCardNumber(String plentiCardNumber) {
		this.plentiCardNumber = plentiCardNumber;
	}

	

}
