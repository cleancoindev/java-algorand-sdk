package com.algorand.algosdk.v2.client.model;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AccountsResponse {

	private List<Account> accounts;
	private boolean accountsIsSet;
	@JsonProperty("accounts")
	public void setAccounts(List<Account> accounts){
		this.accounts = accounts;
		accountsIsSet = true;
	}
	@JsonProperty("accounts")
	public List<Account> getAccounts(){
		return accountsIsSet ? accounts : null;
	}
	/**
	 * Check if has a value for accounts 
	 */	@JsonIgnore
	public boolean hasAccounts(){
		return accountsIsSet;
	}

	/**
	 * Round at which the results were computed. 
	 */
	private long currentRound;
	private boolean currentRoundIsSet;
	@JsonProperty("current-round")
	public void setCurrentRound(long currentRound){
		this.currentRound = currentRound;
		currentRoundIsSet = true;
	}
	@JsonProperty("current-round")
	public Long getCurrentRound(){
		return currentRoundIsSet ? currentRound : null;
	}
	/**
	 * Check if has a value for currentRound 
	 */	@JsonIgnore
	public boolean hasCurrentRound(){
		return currentRoundIsSet;
	}

	/**
	 * Used for pagination, when making another request provide this token with the 
	 * next parameter. 
	 */
	private String nextToken;
	private boolean nextTokenIsSet;
	@JsonProperty("next-token")
	public void setNextToken(String nextToken){
		this.nextToken = nextToken;
		nextTokenIsSet = true;
	}
	@JsonProperty("next-token")
	public String getNextToken(){
		return nextTokenIsSet ? nextToken : null;
	}
	/**
	 * Check if has a value for nextToken 
	 */	@JsonIgnore
	public boolean hasNextToken(){
		return nextTokenIsSet;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) return true;
		if (o == null) return false;

		AccountsResponse other = (AccountsResponse) o;
		if (!Objects.deepEquals(this.accounts, other.accounts)) return false;
		if (!Objects.deepEquals(this.currentRound, other.currentRound)) return false;
		if (!Objects.deepEquals(this.nextToken, other.nextToken)) return false;

		return true;
	}

	@Override
	public String toString() {
		ObjectMapper om = new ObjectMapper(); 
		String jsonStr;
		try {
			jsonStr = om.setSerializationInclusion(Include.NON_NULL).writeValueAsString(this);

		} catch (JsonProcessingException e) {
			throw new RuntimeException(e.getMessage());
		}
		return jsonStr;
	}
}
