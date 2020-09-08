package com.coronavirus.tracker.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class CovidStats {

	//@Autowired
	//private CaseDaily caseDaily;
	
	@Autowired
	private CasesStateWise casesStateWise;
	
	@Autowired
	private TestingStats testingStats;

	public CaseDaily getCaseDaily() {
		return caseDaily;
	}
	public void setCaseDaily(CaseDaily caseDaily) {
		this.caseDaily = caseDaily;
	}
	public CasesStateWise getCasesStateWise() {
		return casesStateWise;
	}
	public void setCasesStateWise(CasesStateWise casesStateWise) {
		this.casesStateWise = casesStateWise;
	}
	public TestingStats getTestingStats() {
		return testingStats;
	}
	public void setTestingStats(TestingStats testingStats) {
		this.testingStats = testingStats;
	}
}
