package com.coronavirus.tracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TestingStats")
public class TestingStats {

	@Column
	private int dailyrtpcrtests;
	
	@Column
	private int individualstestedperconfirmedcase;
	
	@Column
	private int positivecasesfromsamplesreported;
	
	@Column
	private int samplereportedtoday;
	
	@Column
	private String source;
	
	@Column
	private String source1;
	
	@Column
	private String source3;
	
	@Column
	private String testedasof;
	
	@Column
	private String testpositivityrate;
	
	@Column
	private int testsconductedbyprivatelabs;
	
	@Column
	private int testsperconfirmedcase;
	
	@Column
	private int testspermillion;
	
	@Column
	private int totalindividualstested;
	
	@Column
	private int totalpositivecases;
	
	@Column
	private int totalrtpcrtestsm;
	
	@Column
	private int totalsamplestested;
	
	@Column
	private String updatetimestamp;

	public int getDailyrtpcrtests() {
		return dailyrtpcrtests;
	}

	public void setDailyrtpcrtests(int dailyrtpcrtests) {
		this.dailyrtpcrtests = dailyrtpcrtests;
	}

	public int getIndividualstestedperconfirmedcase() {
		return individualstestedperconfirmedcase;
	}

	public void setIndividualstestedperconfirmedcase(int individualstestedperconfirmedcase) {
		this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
	}

	public int getPositivecasesfromsamplesreported() {
		return positivecasesfromsamplesreported;
	}

	public void setPositivecasesfromsamplesreported(int positivecasesfromsamplesreported) {
		this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
	}

	public int getSamplereportedtoday() {
		return samplereportedtoday;
	}

	public void setSamplereportedtoday(int samplereportedtoday) {
		this.samplereportedtoday = samplereportedtoday;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource1() {
		return source1;
	}

	public void setSource1(String source1) {
		this.source1 = source1;
	}

	public String getSource3() {
		return source3;
	}

	public void setSource3(String source3) {
		this.source3 = source3;
	}

	public String getTestedasof() {
		return testedasof;
	}

	public void setTestedasof(String testedasof) {
		this.testedasof = testedasof;
	}

	public String getTestpositivityrate() {
		return testpositivityrate;
	}

	public void setTestpositivityrate(String testpositivityrate) {
		this.testpositivityrate = testpositivityrate;
	}

	public int getTestsconductedbyprivatelabs() {
		return testsconductedbyprivatelabs;
	}

	public void setTestsconductedbyprivatelabs(int testsconductedbyprivatelabs) {
		this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
	}

	public int getTestsperconfirmedcase() {
		return testsperconfirmedcase;
	}

	public void setTestsperconfirmedcase(int testsperconfirmedcase) {
		this.testsperconfirmedcase = testsperconfirmedcase;
	}

	public int getTestspermillion() {
		return testspermillion;
	}

	public void setTestspermillion(int testspermillion) {
		this.testspermillion = testspermillion;
	}

	public int getTotalindividualstested() {
		return totalindividualstested;
	}

	public void setTotalindividualstested(int totalindividualstested) {
		this.totalindividualstested = totalindividualstested;
	}

	public int getTotalpositivecases() {
		return totalpositivecases;
	}

	public void setTotalpositivecases(int totalpositivecases) {
		this.totalpositivecases = totalpositivecases;
	}

	public int getTotalrtpcrtestsm() {
		return totalrtpcrtestsm;
	}

	public void setTotalrtpcrtestsm(int totalrtpcrtestsm) {
		this.totalrtpcrtestsm = totalrtpcrtestsm;
	}

	public int getTotalsamplestested() {
		return totalsamplestested;
	}

	public void setTotalsamplestested(int totalsamplestested) {
		this.totalsamplestested = totalsamplestested;
	}

	public String getUpdatetimestamp() {
		return updatetimestamp;
	}

	public void setUpdatetimestamp(String updatetimestamp) {
		this.updatetimestamp = updatetimestamp;
	}
}
