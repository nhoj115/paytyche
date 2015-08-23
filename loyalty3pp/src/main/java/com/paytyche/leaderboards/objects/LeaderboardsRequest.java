package com.paytyche.leaderboards.objects;

public class LeaderboardsRequest {

	private String transactionID;
	private String mobileNumber;
	private String storeID;
	private int merchantID;
	
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
	
}
