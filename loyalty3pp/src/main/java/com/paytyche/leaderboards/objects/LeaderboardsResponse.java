package com.paytyche.leaderboards.objects;

import java.util.ArrayList;

public class LeaderboardsResponse {

	private String transactionID;
	private String storeID;
	private int merchantID;
	private ArrayList<Leader> leaders;
	private int status = -1;
	private String description = "System is busy. Please try again later";
	
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getStoreID() {
		return storeID;
	}
	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}
	public int getMerchantID() {
		return merchantID;
	}
	public void setMerchantID(int merchantID) {
		this.merchantID = merchantID;
	}
	public ArrayList<Leader> getLeaders() {
		return leaders;
	}
	public void setLeaders(ArrayList<Leader> leaders) {
		this.leaders = leaders;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
