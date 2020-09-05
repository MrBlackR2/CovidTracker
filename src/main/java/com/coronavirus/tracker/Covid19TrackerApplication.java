package com.coronavirus.tracker;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.coronavirus.tracker.model.CovidStatus;
import com.coronavirus.tracker.parser.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Covid19TrackerApplication implements CommandLineRunner {
	
	private static final Logger logger = LogManager.getLogger(Covid19TrackerApplication.class); 
	public static void main(String[] args) {
		SpringApplication.run(Covid19TrackerApplication.class, args);
	}
	
	//@Bean
	public void run(String[] args) throws Exception {
		logger.info("This is the Mail Program After SpringBoot");
		//JsonParser json = new JsonParser();
		//json.readFile();
		//ObjectMapper mapper = new ObjectMapper();
		//CovidStatus jparser = mapper.readValue(new File("C://Users/rrajput/Downloads/Covid19-Tracker/src/main/resources/US.json"), CovidStatus.class);
	
	}
}

