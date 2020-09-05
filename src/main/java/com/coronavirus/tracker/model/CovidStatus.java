package com.coronavirus.tracker.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Covid19")
public class CovidStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int covidId;
	
	@Column
	private String date;
	
	@Column
	private String states;
	
	@Column
	private long positive;
	
	@Column
	private long negative;
	
	@Column
	private long pending;
	
	public int getCovidId() {
		return covidId;
	}
	public void setCovidId(int covidId) {
		this.covidId = covidId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public long getPositive() {
		return positive;
	}
	public void setPostive(long positive) {
		this.positive = positive;
	}
	public long getNegative() {
		return negative;
	}
	public void setNegative(long negative) {
		this.negative = negative;
	}
	public long getPending() {
		return pending;
	}
	public void setPending(long pending) {
		this.pending = pending;
	}
}
