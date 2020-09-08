package com.coronavirus.tracker.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coronavirus.tracker.core.CoronavirusServiceImp;
import com.coronavirus.tracker.model.CovidStats;
import com.coronavirus.tracker.model.CovidStatus;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonParser {

	@Autowired
	public CoronavirusServiceImp coronavirusServiceImp;
	private static final String JSON_FILE="/US.json";
	private static final String url= "https://api.covid19india.org/data.json";

	public void readFile() throws MalformedURLException{	
		
		InputStream inputStream = CovidStatus.class.getClass().getResourceAsStream(JSON_FILE);
		URL urlObject = new URL(url);
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			CovidStats covidStats =  objectMapper.readValue(urlObject, CovidStats.class);
			//CovidStatus covidStatus =  objectMapper.readValue(inputStream, CovidStatus.class);
			//coronavirusServiceImp.saveCovidDailystatus(covidStatus);
			
		} catch (IOException e){
			System.out.println("Unable to save users: " + e.getMessage());
		}

	}

}
