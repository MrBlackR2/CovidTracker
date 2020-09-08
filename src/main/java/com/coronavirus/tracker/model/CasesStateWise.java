package com.coronavirus.tracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CasesStateWise")
public class CasesStateWise {

	@Column
	private int active;
	
	@Column
	private int confirmed;
	
	@Column
	private int deaths;
	
	@Column
	private int deltaconfirmed;
	
	@Column
	private int deltadeaths;
	
	@Column
	private int deltarecovered;
	
	@Column
	private String lastupdatedtime;
	
	@Column
	private int migratedother;
	
	@Column
	private int recovered;
	
	@Column
	private String state;

	@Column
	private String statecode;
	
	@Column
	private String statenotes;
	
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getDeltaconfirmed() {
		return deltaconfirmed;
	}
	public void setDeltaconfirmed(int deltaconfirmed) {
		this.deltaconfirmed = deltaconfirmed;
	}
	public int getDeltadeaths() {
		return deltadeaths;
	}
	public void setDeltadeaths(int deltadeaths) {
		this.deltadeaths = deltadeaths;
	}
	public int getDeltarecovered() {
		return deltarecovered;
	}
	public void setDeltarecovered(int deltarecovered) {
		this.deltarecovered = deltarecovered;
	}
	public String getLastupdatedtime() {
		return lastupdatedtime;
	}
	public void setLastupdatedtime(String lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}
	public int getMigratedother() {
		return migratedother;
	}
	public void setMigratedother(int migratedother) {
		this.migratedother = migratedother;
	}
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStatecode() {
		return statecode;
	}
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
	public String getStatenotes() {
		return statenotes;
	}
	public void setStatenotes(String statenotes) {
		this.statenotes = statenotes;
	}
}
