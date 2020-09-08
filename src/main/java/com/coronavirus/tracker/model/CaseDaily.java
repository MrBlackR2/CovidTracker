package com.coronavirus.tracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CaseDaily")
public class CaseDaily {
	
	@Column
	private long dailyConfirmed;
	
	@Column
	private long dailyDeceased;
	
	@Column
	private long dailyRecovered;
	
	@Column
	private String Date;
	
	@Column
	private long totalConfirmed;
	
	@Column
	private long totalDeceased;
	
	@Column
	private long totalRecovered;
	
	public long getDailyConfirmed() {
		return dailyConfirmed;
	}
	public void setDailyConfirmed(long dailyConfirmed) {
		this.dailyConfirmed = dailyConfirmed;
	}
	public long getDailyDeceased() {
		return dailyDeceased;
	}
	public void setDailyDeceased(long dailyDeceased) {
		this.dailyDeceased = dailyDeceased;
	}
	public long getDailyRecovered() {
		return dailyRecovered;
	}
	public void setDailyRecovered(long dailyRecovered) {
		this.dailyRecovered = dailyRecovered;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}
	public long getTotalConfirmed() {
		return totalConfirmed;
	}
	public void setTotalConfirmed(long totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}
	public long getTotalDeceased() {
		return totalDeceased;
	}
	public void setTotalDeceased(long totalDeceased) {
		this.totalDeceased = totalDeceased;
	}
	public long getTotalRecovered() {
		return totalRecovered;
	}
	public void setTotalRecovered(long totalRecovered) {
		this.totalRecovered = totalRecovered;
	}	
}
