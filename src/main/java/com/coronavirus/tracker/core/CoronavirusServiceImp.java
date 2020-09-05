package com.coronavirus.tracker.core;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.SystemPropertyUtils;

import com.coronavirus.tracker.Dao.CoronavirusRepository;
import com.coronavirus.tracker.model.CovidStatus;

@Service
public class CoronavirusServiceImp {

	@Autowired
	private CoronavirusRepository covidRepositoy;

	public void saveCovidDailystatus(CovidStatus covidStatus){
		System.out.println("saveCovidDailystatus");
		covidRepositoy.save(covidStatus);
	}

	public CovidStatus getDailyCovidStatus(int CovidId){
		
		Optional<CovidStatus> DailyStatus = covidRepositoy.findById(CovidId);
		if(DailyStatus != null){
			return DailyStatus.get();
		}
		else{
			return null;
		}
	}
}
