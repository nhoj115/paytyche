package com.paytyche.account.objects;

import java.util.ArrayList;

public class CheckMsisdnResponse {
	
	private String isRegistered;
	private String facebookID;
	private ArrayList<String> cards;
	
	public String getIsRegistered() {
		return isRegistered;
	}
	public void setIsRegistered(String isRegistered) {
		this.isRegistered = isRegistered;
	}
	public String getFacebookID() {
		return facebookID;
	}
	public void setFacebookID(String facebookID) {
		this.facebookID = facebookID;
	}
	public ArrayList<String> getCards() {
		return cards;
	}
	public void setCards(ArrayList<String> cards) {
		this.cards = cards;
	}
	
}
