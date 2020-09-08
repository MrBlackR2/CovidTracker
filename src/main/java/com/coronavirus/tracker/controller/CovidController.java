package com.coronavirus.tracker.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coronavirus.tracker.core.CoronavirusServiceImp;
import com.coronavirus.tracker.model.CovidStatus;
import com.coronavirus.tracker.parser.JsonParser;

@RestController
@RequestMapping(value = "/api")
class CovidController {
	
	@Autowired
	private CoronavirusServiceImp coronavirusServiceImp;
	
	@Autowired
	private JsonParser jsonParser;
	
	@GetMapping("/getstatus/{covidId}")
	public ResponseEntity<CovidStatus> DailyStatus(@PathVariable("covidId") int CovidId){
		CovidStatus covidstatus = coronavirusServiceImp.getDailyCovidStatus(CovidId);
		if(covidstatus != null){
			return ResponseEntity.ok().body(covidstatus);
		}else{
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/parse")
	public String operation_Perf() throws IOException{
		jsonParser.readFile();
		return "success";
	}
	
}
