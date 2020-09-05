package com.coronavirus.tracker.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coronavirus.tracker.Dao.CoronavirusRepository;
import com.coronavirus.tracker.core.CoronavirusServiceImp;
import com.coronavirus.tracker.model.CovidStatus;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonParser {

	@Autowired
	public CoronavirusServiceImp coronavirusServiceImp;
	
	@Autowired
	private CoronavirusRepository covidRepositoy;
	
	private static final String JSON_FILE="/US.json";
	
	public void readFile() throws IOException{
	
		//BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream));
		TypeReference<CovidStatus> typeReference = new TypeReference<CovidStatus>(){};
		InputStream inputStream = TypeReference.class.getClass().getResourceAsStream(JSON_FILE);
		ObjectMapper objectMapper = new ObjectMapper();
		

		try {
			CovidStatus covidStatus =  objectMapper.readValue(inputStream, CovidStatus.class);
			System.out.println(covidStatus.getDate());
			System.out.println(covidStatus.getNegative());
			//CoronavirusServiceImp imp = new CoronavirusServiceImp ();
		//	imp.saveCovidDailystatus(covidStatus);
			coronavirusServiceImp.saveCovidDailystatus(covidStatus);
			System.out.println("Users Saved!");
		} catch (IOException e){
			System.out.println("Unable to save users: " + e.getMessage());
		}
		
	}

}
